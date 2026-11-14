# الطلب الأول: التعريف بالتقنيات المستخدمة

في هذا القسم سنتعرف على التقنيات التي سنقوم بتحليلها في مشروع المترجمات، وهي:
Java و Spring Boot و Thymeleaf و HTML و CSS.
ركزنا في الشرح على الأجزاء التي تهمنا في المشروع فقط (أي التراكيب التي سيقوم المحلل بالتعرف عليها)، وليس على كل تفاصيل هذه التقنيات.

---

## 1. لغة Java

### ما هي Java؟
Java هي لغة برمجة كائنية التوجه (Object Oriented) وعالية المستوى، طورتها شركة Sun Microsystems عام 1995 وأصبحت الآن تابعة لشركة Oracle.
من أهم مميزاتها:
- **مستقلة عن المنصة:** يتم ترجمة الكود إلى Bytecode (ملفات `.class`) ويتم تنفيذه على الـ JVM (Java Virtual Machine)، لذلك نفس البرنامج يعمل على Windows و Linux و Mac.
- **Strongly Typed:** يجب التصريح عن نوع كل متغير.
- **كائنية التوجه:** كل شيء تقريباً موجود داخل صف (class).
- تدعم الوراثة (Inheritance) والتعددية الشكلية (Polymorphism) والتغليف (Encapsulation).

### البنية الأساسية لملف Java
أي ملف Java يتكون بالترتيب من:

```java
package com.example.shop.controller;      // 1. التصريح عن الحزمة (اختياري)

import java.util.List;                     // 2. الاستيرادات
import java.util.ArrayList;

public class ProductController {           // 3. التصريح عن الصف
    private List<Product> products;        //    حقل (field)

    public ProductController() { ... }     //    باني (constructor)

    public String listProducts() { ... }   //    تابع (method)
}
```

### العناصر الأساسية التي يتعامل معها المشروع

| العنصر | مثال | الشرح |
|---|---|---|
| Package | `package com.example.shop;` | تجميع الصفوف في حزم |
| Import | `import java.util.List;` | استيراد صفوف من حزم أخرى |
| Class | `public class Product { }` | تعريف صف |
| Modifiers | `public`, `private`, `static`, `final` | محددات الوصول والخصائص |
| Field | `private String name;` | متغير تابع للصف |
| Constructor | `public Product(String name) { }` | تابع خاص بإنشاء الكائن، له نفس اسم الصف |
| Method | `public String getName() { return name; }` | تابع له نوع إرجاع واسم وبارامترات |
| Annotation | `@Controller`, `@GetMapping("/products")` | معلومات إضافية (metadata) تضاف للصف أو التابع أو البارامتر |
| Generics | `List<Product>` | أنواع عامة تأخذ نوع كبارامتر |

### التعليمات (Statements)
- التصريح عن متغير محلي: `Product product = null;`
- الشرط: `if (x > 0) { ... } else { ... }`
- الحلقات: `for (int i = 0; i < 10; i++)` و `for (Product p : products)` و `while (...)`
- الإرجاع: `return "products";`
- تعليمة تعبير: `model.addAttribute("products", products);`

### التعابير (Expressions)
- القيم الثابتة (Literals): أعداد صحيحة `5` و `4L`، أعداد عشرية `12.5`، نصوص `"hello"`، `true`, `false`, `null`.
- العمليات الحسابية `+ - * / %` والمقارنة `< > <= >= == !=` والمنطقية `&& || !`.
- الإسناد `=` و `+=` و `-=`.
- استدعاء التوابع: `products.add(p)` والوصول للحقول: `this.name`.
- إنشاء كائن: `new Product()`.
- تعابير Lambda البسيطة: `p -> p.getId()` (تستخدم كثيراً مع الـ Streams).

### Annotations
الـ Annotations مهمة جداً في مشروعنا لأن Spring Boot يعتمد عليها بشكل كامل.
شكلها العام: `@Name` أو `@Name(value)` أو `@Name(key = value, key2 = value2)`.

---

## 2. إطار العمل Spring Boot

### ما هو Spring؟ وما هو Spring Boot؟
**Spring Framework** هو إطار عمل مكتوب بلغة Java لبناء التطبيقات وخصوصاً تطبيقات الويب. يعتمد على مفهومين أساسيين:
- **Inversion of Control (IoC):** الإطار هو المسؤول عن إنشاء الكائنات (تسمى Beans) وليس المبرمج.
- **Dependency Injection (DI):** الإطار يقوم بحقن الكائنات التي يحتاجها الصف تلقائياً.

**Spring Boot** هو نسخة مبسطة من Spring تقلل الإعدادات (Configuration) المطلوبة، فهو:
- يحتوي على سيرفر مدمج (Tomcat) فلا نحتاج لتنصيب سيرفر خارجي.
- يقوم بإعداد معظم الأشياء تلقائياً (Auto Configuration).
- يستخدم الـ Starters مثل `spring-boot-starter-web` و `spring-boot-starter-thymeleaf`.

### معمارية MVC
تطبيق Spring Boot مع Thymeleaf يتبع نمط **MVC (Model - View - Controller)**:

```
 المستخدم (المتصفح)
        |   طلب HTTP  (GET /products)
        v
   [ Controller ]  ---- يضع البيانات في ---->  [ Model ]
        |                                          |
        |  يرجع اسم القالب "products"               |
        v                                          v
   [ View = Thymeleaf Template (products.html) ] <--
        |
        v
   صفحة HTML نهائية ترجع للمتصفح
```

- **Model:** البيانات (مثلاً صف `Product`).
- **View:** القالب (ملف HTML مع Thymeleaf).
- **Controller:** الصف الذي يستقبل الطلبات ويقرر أي قالب يعرض وما هي البيانات المرسلة له.

### أهم المكونات (Annotations) المستخدمة في المشروع

| Annotation | مكان الاستخدام | الوظيفة |
|---|---|---|
| `@SpringBootApplication` | الصف الرئيسي | نقطة بداية التطبيق |
| `@Controller` | صف | يعرف الصف كـ Controller يرجع أسماء قوالب (Views) |
| `@RestController` | صف | Controller يرجع بيانات (JSON) بدل قوالب |
| `@RequestMapping("/products")` | صف أو تابع | ربط مسار (URL) بالصف أو التابع |
| `@GetMapping("/...")` | تابع | استقبال طلب GET |
| `@PostMapping("/...")` | تابع | استقبال طلب POST (مثل إرسال فورم) |
| `@PathVariable` | بارامتر | قراءة قيمة من المسار مثل `/products/{id}` |
| `@RequestParam` | بارامتر | قراءة قيمة من الـ query string مثل `?name=x` |
| `@ModelAttribute` | بارامتر | ربط بيانات الفورم بكائن |
| `@Autowired` | حقل أو باني | حقن كائن (Dependency Injection) |
| `@Service`, `@Repository` | صف | تعريف طبقة الخدمات وطبقة الوصول للبيانات |

### الصف Model
التوابع داخل الـ Controller تأخذ عادة بارامتر من نوع `Model`، ونستخدم التابع `addAttribute` لتمرير البيانات للقالب:

```java
@GetMapping("/products")
public String listProducts(Model model) {
    model.addAttribute("products", products);  // اسم المتغير في القالب = "products"
    return "products";                         // اسم القالب = templates/products.html
}
```

**ملاحظة مهمة للمشروع:** القيمة النصية المرجعة من التابع هي اسم القالب، والاسم الأول في `addAttribute` هو اسم المتغير الذي سيستخدم داخل القالب بالشكل `${products}`. هذه هي العلاقة التي سنحللها لاحقاً في الطلب السابع.
وإذا كانت القيمة المرجعة تبدأ بـ `redirect:` فهذا يعني إعادة توجيه لمسار آخر وليس اسم قالب.

### بنية مشروع Spring Boot

```
src/main/java/com/example/shop/
    ShopApplication.java
    controller/ProductController.java
    model/Product.java
src/main/resources/
    templates/      <-- قوالب Thymeleaf
        products.html
        add-product.html
        product-details.html
    static/         <-- ملفات CSS والصور
    application.properties
```

---

## 3. محرك القوالب Thymeleaf

### ما هو Thymeleaf؟
Thymeleaf هو محرك قوالب (Template Engine) لـ Java يعمل من جهة السيرفر (Server Side). يأخذ ملف HTML يحتوي على خصائص (attributes) خاصة تبدأ بـ `th:` ويبدلها بالبيانات القادمة من الـ Controller، ثم ينتج صفحة HTML عادية.

من مميزاته أن القالب هو ملف HTML صالح (Natural Templates)، أي يمكن فتحه بالمتصفح مباشرة حتى بدون تشغيل السيرفر.

لاستخدامه نضيف الـ namespace في وسم `html`:

```html
<html xmlns:th="http://www.thymeleaf.org">
```

### أنواع التعابير (Standard Expressions)

| النوع | الشكل | المثال | الشرح |
|---|---|---|---|
| Variable Expression | `${...}` | `${product.name}` | الوصول لمتغير من الـ Model |
| Selection Expression | `*{...}` | `*{price}` | الوصول لخاصية من الكائن المحدد بـ `th:object` |
| Link (URL) Expression | `@{...}` | `@{/products/{id}(id=${p.id})}` | بناء الروابط |
| Message Expression | `#{...}` | `#{home.title}` | نصوص من ملفات الرسائل (للترجمة) |

داخل التعابير يمكن استخدام:
- النصوص `'text'` والأرقام و `true/false/null`.
- العمليات الحسابية `+ - * / %` والمقارنة `> < >= <= == !=` والمنطقية `and or !`.
- الشرط الثلاثي `cond ? a : b`.
- استدعاء التوابع `${p.getName()}` والكائنات المساعدة مثل `${#lists.isEmpty(products)}`.

### أهم الخصائص (Attributes)

| الخاصية | الوظيفة | مثال |
|---|---|---|
| `th:text` | وضع نص داخل العنصر | `<span th:text="${p.name}">`|
| `th:each` | التكرار على قائمة | `<tr th:each="p : ${products}">` |
| `th:if` / `th:unless` | عرض العنصر حسب شرط | `<p th:if="${products.isEmpty()}">` |
| `th:href` | رابط | `<a th:href="@{/products/new}">` |
| `th:src` | مصدر صورة | `<img th:src="${p.imageUrl}">` |
| `th:action` | عنوان إرسال الفورم | `<form th:action="@{/products/add}">` |
| `th:object` | تحديد الكائن المرتبط بالفورم | `<form th:object="${product}">` |
| `th:field` | ربط حقل إدخال بخاصية من الكائن | `<input th:field="*{name}">` |
| `th:value` | قيمة الحقل | `<input th:value="${p.id}">` |
| `th:class`, `th:style` | تعديل الصنف أو التنسيق | |

### مثال

```html
<tr th:each="p : ${products}">
    <td th:text="${p.name}">اسم المنتج</td>
    <td th:text="${p.price}">0</td>
    <td><a th:href="@{/products/{id}(id=${p.id})}">التفاصيل</a></td>
</tr>
```

هنا `products` هو نفس الاسم الذي وضعناه في `model.addAttribute("products", ...)` داخل الـ Controller.

---

## 4. لغة HTML

### ما هي HTML؟
HTML (HyperText Markup Language) هي لغة توصيف (وليست لغة برمجة) تستخدم لبناء هيكل صفحات الويب. تتكون من عناصر (Elements) تكتب باستخدام وسوم (Tags).

### البنية الأساسية

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>عنوان الصفحة</title>
</head>
<body>
    <h1>مرحبا</h1>
</body>
</html>
```

### مكونات العنصر

```
   وسم البداية            المحتوى      وسم النهاية
 <a href="/products">   المنتجات      </a>
     |      |
  اسم الوسم  خاصية (attribute) = قيمة
```

- **وسم البداية:** `<tagName attributes>`
- **وسم النهاية:** `</tagName>`
- **العناصر الفارغة (Void Elements):** لا تملك وسم نهاية مثل `<img>`, `<input>`, `<br>`, `<hr>`, `<meta>`, `<link>`. ويمكن كتابتها بالشكل `<br/>`.
- **الخصائص (Attributes):** `name="value"` وبعضها بدون قيمة مثل `required`.
- **التعليقات:** `<!-- comment -->`.

### أهم العناصر المستخدمة في المشروع
- العناوين والنصوص: `h1..h6`, `p`, `span`, `div`.
- الروابط والصور: `a`, `img`.
- الجداول: `table`, `tr`, `th`, `td`.
- الفورم: `form`, `input`, `textarea`, `label`, `button`.
- عناصر الرأس: `head`, `title`, `meta`, `link`, `style`.

---

## 5. لغة CSS

### ما هي CSS؟
CSS (Cascading Style Sheets) هي لغة تستخدم لتنسيق صفحات HTML (الألوان، الخطوط، الأبعاد، المواقع...).
يمكن كتابتها بثلاث طرق:
1. داخل الوسم مباشرة: `<p style="color: red;">`
2. داخل الوسم `<style>` في الـ head.
3. في ملف خارجي `.css` يتم ربطه بالوسم `<link>`.

في مشروعنا نقوم بتحليل الـ CSS المكتوب داخل الوسم `<style>`.

### البنية الأساسية (Rule)

```css
selector {
    property: value;
    property: value;
}
```

مثال:
```css
.product-card {
    border: 1px solid #ddd;
    padding: 10px;
    width: 30%;
}
```

### أنواع المحددات (Selectors)

| المحدد | المثال | يختار |
|---|---|---|
| Element | `p` | كل عناصر p |
| Class | `.card` | العناصر التي لها `class="card"` |
| ID | `#header` | العنصر الذي له `id="header"` |
| Universal | `*` | كل العناصر |
| Descendant | `div p` | كل p داخل div |
| Child | `ul > li` | الأبناء المباشرون |
| Pseudo-class | `a:hover` | حالة معينة للعنصر |
| Group | `h1, h2` | أكثر من محدد بنفس التنسيق |

### القيم (Values)
- كلمات: `red`, `bold`, `center`, `solid`.
- أرقام مع واحدات: `10px`, `1.5em`, `50%`.
- ألوان: `#fff`, `#1a2b3c`, `rgb(0, 0, 0)`.
- نصوص: `"Arial"`.
- توابع: `rgb(...)`, `url(...)`.

---

## 6. العلاقة بين التقنيات في المشروع

```
  ProductController.java  (Java + Spring Boot)
        |
        |  model.addAttribute("products", list)
        |  return "products"
        v
  products.html  (HTML + Thymeleaf + CSS)
        |
        |  th:each="p : ${products}"
        v
  صفحة HTML نهائية تعرض المنتجات
```

لذلك المحلل الذي سنبنيه يحتاج لقسمين:
1. **محلل لملفات Java:** يتعرف على الصفوف والـ Annotations والتوابع والتعليمات.
2. **محلل لملفات القوالب:** يتعرف على وسوم HTML وخصائص Thymeleaf وتعابيرها، وقواعد CSS داخل وسم `<style>`.

وهذا ما سنقوم به في الطلب الثاني.
