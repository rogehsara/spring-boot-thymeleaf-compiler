# الطلب الثاني: بناء قواعد اللغات (Lexer & Parser)

استخدمنا أداة **ANTLR 4** (الإصدار 4.13.1) لكتابة القواعد، وهي أداة بتاخد ملف قواعد `.g4` وبتولد منه كود Java للـ Lexer والـ Parser.

قسمنا القواعد لقسمين، وكل قسم إلو Lexer و Parser منفصلين:

| الملف | الوظيفة |
|---|---|
| `grammar/JavaLexer.g4` | تقسيم ملف Java لتوكنات |
| `grammar/JavaParser.g4` | القواعد النحوية لملفات Java (Controller و Model) |
| `grammar/HTMLLexer.g4` | تقسيم القالب لتوكنات (HTML + Thymeleaf + CSS) |
| `grammar/HTMLParser.g4` | القواعد النحوية للقوالب |

---

## 1. قواعد Java

### الـ Lexer
بيتعرف على:
- **الكلمات المحجوزة:** `package, import, class, public, private, static, return, if, for, new, ...`
- **الأنواع الأساسية:** `int, long, double, boolean, ...`
- **الرموز:** `( ) { } [ ] ; , . @ -> ::`
- **العمليات:** `+ - * / % == != < > <= >= && || ! = += -= ++ --`
- **القيم الثابتة:** `INT_LITERAL` (مثل `5` و `4L`)، `FLOAT_LITERAL` (مثل `12.5`)، `STRING_LITERAL`، `CHAR_LITERAL`.
- **الأسماء:** `IDENTIFIER`.
- التعليقات والفراغات منتجاهلها (`-> skip`).

ملاحظة: حطينا الكلمات المحجوزة قبل `IDENTIFIER` لأن ANTLR لما يكون في قاعدتين بيطابقوا نفس الطول بياخد الأولى.

### الـ Parser
البنية العامة:

```
compilationUnit  : packageDeclaration? importDeclaration* classDeclaration* EOF
classDeclaration : annotation* modifier* class IDENTIFIER (extends ..)? classBody
classMember      : constructorDeclaration | methodDeclaration | fieldDeclaration
methodDeclaration: annotation* modifier* (type | void) IDENTIFIER ( parameterList? ) block
parameter        : annotation* type IDENTIFIER
annotation       : @ qualifiedName ( ( annotationArguments ) )?
```

- **Annotations:** بتدعم الأشكال الثلاثة `@Controller` و `@GetMapping("/x")` و `@RequestParam(name = "x", required = false)`. وممكن تنحط على الصف أو التابع أو الحقل أو البارامتر.
- **الأنواع:** بتدعم الـ Generics مثل `List<Product>` و `Map<String, List<Product>>` و `new ArrayList<>()`.
- **التعليمات:** block، تعريف متغير محلي، if/else، for العادية، for-each، while، return، break، continue، وتعليمة التعبير.
- **التعابير:** كتبناها بقاعدة وحدة `expression` يستدعي حالو (left recursion) وANTLR بيدعم هالشي. ترتيب البدائل هو الأولوية:
  1. استدعاء تابع والوصول لحقل `a.b()` و `a.b`
  2. `new`
  3. `++ --` و `! -`
  4. `* / %`
  5. `+ -`
  6. `< > <= >=`
  7. `== !=`
  8. `&&` ثم `||`
  9. `? :` ثم الإسناد `= += -=` (من اليمين لليسار `<assoc=right>`)
- **Lambda بسيطة:** `p -> p.getId().equals(id)` لأنها كتير بتستخدم مع الـ streams.

حطينا labels للبدائل (مثل `# methodCallExpr`، `# ifStatement`) مشان بالـ Visitor (الطلب الرابع) يتولد تابع لكل بديل لحال وتكون عملية بناء الـ AST أسهل.

---

## 2. قواعد القوالب (HTML + Thymeleaf + CSS)

### المشكلة
بالقالب نفس الحرف إلو معنى مختلف حسب مكانه، مثلاً:
- `{` جوا `<style>` هي بداية قاعدة CSS.
- `{` جوا `th:href="@{/products/{id}}"` هي جزء من رابط.
- `{` بالنص العادي هي مجرد نص.

### الحل: Lexer Modes
ANTLR بيسمح نقسم الـ Lexer لعدة أوضاع (modes)، وكل وضع إلو توكنات خاصة فيه:

```
          '<'                       'th:xxx'                '"'
DEFAULT  ------>  TAG  ---------------------->  TH_ATTR  ------>  TH_VALUE
   ^              |  ^                                               |
   |     '>' '/>' |  |____________________ '"' ______________________|
   |______________|
   |
   |  '<style>'           '</style>'
   +-------------> CSS  ------------> DEFAULT
```

| Mode | متى منكون فيه | أهم التوكنات |
|---|---|---|
| DEFAULT | النص بين الوسوم | `DOCTYPE`, `TAG_OPEN`, `TAG_OPEN_SLASH`, `STYLE_OPEN`, `HTML_TEXT` |
| TAG | جوا الوسم | `TAG_NAME`, `VOID_TAG_NAME`, `TH_ATTR_NAME`, `ATTR_VALUE`, `TAG_CLOSE` |
| TH_ATTR | بعد اسم خاصية th | `TH_EQUALS`, `TH_QUOTE_OPEN` |
| TH_VALUE | جوا قيمة خاصية th | `VAR_START ${`, `SEL_START *{`, `LINK_START @{`, `MSG_START #{`, `TH_ID`, العمليات... |
| CSS | جوا `<style>` | `CSS_IDENT`, `CSS_NUMBER`, `CSS_HASH`, `CSS_LBRACE`, `CSS_COLON`, ... |

ملاحظة عن الانتقال من TH_ATTR لـ TH_VALUE: استخدمنا `mode(TH_VALUE)` بدل `pushMode` مشان لما نوصل لـ `"` الأخيرة نعمل `popMode` مرة وحدة ونرجع مباشرة لـ TAG.

### الـ Parser

**HTML:**
```
document : DOCTYPE? content EOF
content  : (element | styleElement | HTML_TEXT)*
element  : < TAG_NAME attribute* > content </ TAG_NAME >      (normalElement)
         | < TAG_NAME attribute* />                           (selfClosingElement)
         | < VOID_TAG_NAME attribute* (> | />)                (voidElement)
attribute: thAttribute | TAG_NAME (= ATTR_VALUE)?
```
العناصر الفارغة (`input, img, br, hr, meta, link`) عملنالها توكن خاص `VOID_TAG_NAME` لأنها ما إلها وسم نهاية، ولو عاملناها متل باقي العناصر كان الـ parser رح يدور على `</input>`.

**Thymeleaf:**
```
thAttribute        : TH_ATTR_NAME = " thValue "
thValue            : eachExpression | thExpression
eachExpression     : TH_ID (, TH_ID)? : thExpression          // p : ${products}
thExpression       : thPrimary | عمليات حسابية ومنطقية ومقارنة | ? :
thPrimary          : variableExpression | selectionExpression
                   | linkExpression | messageExpression | literal | ( thExpression )
variableExpression : ${ ognlExpression }
selectionExpression: *{ ognlExpression }
linkExpression     : @{ linkUrl linkParameters? }             // @{/products/{id}(id=${p.id})}
ognlExpression     : memberAccess | literal | عمليات ...
memberAccess       : #? TH_ID ( .TH_ID | (args) | [index] )*  // p.name , #lists.isEmpty(x)
```

**CSS:**
```
styleElement   : STYLE_OPEN cssRule* STYLE_CLOSE
cssRule        : selectorList { cssDeclaration* }
selector       : simpleSelector (>? simpleSelector)*
simpleSelector : (ident | *) suffix* | suffix+          // suffix = .class | #id | :hover
cssDeclaration : CSS_IDENT : cssValue+ !important? ;
cssValue       : ident | number | #hash | string | , | / | function
```

---

## 3. التجريب

ملفات الاختبار موجودة بمجلد `tests`:
- `ProductController.java` و `Product.java`
- `products.html` (عرض المنتجات)
- `add-product.html` (إضافة منتج)
- `product-details.html` (عرض تفاصيل منتج)

للتشغيل:
```
run.bat
```
الملف بيولد الـ Lexer والـ Parser بمجلد `gen`، وبيترجمهم مع `src/Main.java`، وبعدين بيطبع شجرة التحليل (Parse Tree) لكل ملف وعدد الأخطاء.
ولطباعة التوكنات كمان:
```
java -cp out;lib\antlr-4.13.1-complete.jar Main tests\products.html -tokens
```

النتيجة: كل ملفات الاختبار انحللت بدون أخطاء (`Syntax errors: 0`).

### القيود (الأشياء اللي ما دعمناها)
- ما دعمنا كل لغة Java (مثلاً: switch، try/catch، الـ casting، الـ inner classes، الـ enums).
- قيم خصائص `th:` لازم تكون بين `"` وليس `'`.
- ما دعمنا الـ inline expressions بالنص مثل `[[${name}]]` ولا الـ literal substitution `|...|`.
- بالـ CSS كل خاصية لازم تنتهي بـ `;` وما دعمنا `@media`.
- ما دعمنا وسم `<script>`.
