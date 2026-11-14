// Lexer لقوالب Thymeleaf (HTML + Thymeleaf + CSS)
// استخدمنا الـ modes لأن نفس الحرف إلو معنى مختلف حسب مكانه
//   DEFAULT  : النص العادي بين الوسوم
//   TAG      : جوا الوسم  <div class="x" ...>
//   TH_ATTR  : بعد اسم خاصية thymeleaf مثل th:text
//   TH_VALUE : جوا قيمة خاصية thymeleaf  "${product.name}"
//   CSS      : جوا وسم <style> ... </style>
lexer grammar HTMLLexer;

// ===================== DEFAULT MODE =====================

HTML_COMMENT    : '<!--' .*? '-->' -> skip ;
DOCTYPE         : '<!' [dD][oO][cC][tT][yY][pP][eE] ~[>]* '>' ;

// وسم style منعالجه لحال مشان نحلل الـ CSS اللي جواته
STYLE_OPEN      : '<style' ~[>]* '>' -> pushMode(CSS) ;

TAG_OPEN_SLASH  : '</' -> pushMode(TAG) ;
TAG_OPEN        : '<'  -> pushMode(TAG) ;

// أي نص ما فيه <
HTML_TEXT       : ~[<]+ ;


// ===================== TAG MODE =====================
mode TAG;

TAG_CLOSE       : '>'  -> popMode ;
TAG_SLASH_CLOSE : '/>' -> popMode ;
TAG_EQUALS      : '=' ;

// خصائص thymeleaf  (th:text, th:each, th:href, ...)
// لازم تكون قبل TAG_NAME
TH_ATTR_NAME    : 'th:' [a-zA-Z] [a-zA-Z\-]* -> pushMode(TH_ATTR) ;

// العناصر الفارغة اللي ما إلها وسم نهاية
VOID_TAG_NAME   : 'input' | 'img' | 'br' | 'hr' | 'meta' | 'link' ;

TAG_NAME        : [a-zA-Z] [a-zA-Z0-9\-_:.]* ;

ATTR_VALUE      : '"' ~["]* '"'
                | '\'' ~[']* '\''
                ;

TAG_WS          : [ \t\r\n]+ -> skip ;


// ===================== TH_ATTR MODE =====================
// منكون هون بعد ما قرينا th:xxx  وناطرين  ="
mode TH_ATTR;

TH_EQUALS       : '=' ;
// بعد الـ " منبدل الـ mode لـ TH_VALUE (mode مش pushMode)
// مشان لما نسكر الـ " نرجع مباشرة على TAG
TH_QUOTE_OPEN   : '"' -> mode(TH_VALUE) ;
TH_ATTR_WS      : [ \t\r\n]+ -> skip ;


// ===================== TH_VALUE MODE =====================
// تعابير thymeleaf
mode TH_VALUE;

TH_QUOTE_CLOSE  : '"' -> popMode ;

VAR_START       : '${' ;     // Variable Expression
SEL_START       : '*{' ;     // Selection Expression
LINK_START      : '@{' ;     // Link Expression
MSG_START       : '#{' ;     // Message Expression

TH_LBRACE       : '{' ;
TH_RBRACE       : '}' ;
TH_LPAREN       : '(' ;
TH_RPAREN       : ')' ;
TH_LBRACK       : '[' ;
TH_RBRACK       : ']' ;
TH_COMMA        : ',' ;
TH_DOT          : '.' ;
TH_COLON        : ':' ;
TH_QUESTION     : '?' ;
TH_HASH         : '#' ;

TH_EQ           : '==' ;
TH_NE           : '!=' ;
TH_LE           : '<=' ;
TH_GE           : '>=' ;
TH_LT           : '<' ;
TH_GT           : '>' ;
TH_ASSIGN       : '=' ;
TH_NOT          : '!' ;
TH_PLUS         : '+' ;
TH_MINUS        : '-' ;
TH_STAR         : '*' ;
TH_SLASH        : '/' ;
TH_PERCENT      : '%' ;

TH_AND          : 'and' ;
TH_OR           : 'or' ;
TH_NOT_WORD     : 'not' ;
TH_TRUE         : 'true' ;
TH_FALSE        : 'false' ;
TH_NULL         : 'null' ;

TH_NUMBER       : [0-9]+ ('.' [0-9]+)? ;
TH_STRING       : '\'' ~[']* '\'' ;
TH_ID           : [a-zA-Z_] [a-zA-Z0-9_]* ;

TH_WS           : [ \t\r\n]+ -> skip ;


// ===================== CSS MODE =====================
mode CSS;

STYLE_CLOSE     : '</style>' -> popMode ;

CSS_COMMENT     : '/*' .*? '*/' -> skip ;
CSS_WS          : [ \t\r\n]+ -> skip ;

CSS_LBRACE      : '{' ;
CSS_RBRACE      : '}' ;
CSS_LPAREN      : '(' ;
CSS_RPAREN      : ')' ;
CSS_COLON       : ':' ;
CSS_SEMI        : ';' ;
CSS_COMMA       : ',' ;
CSS_DOT         : '.' ;
CSS_GT          : '>' ;
CSS_STAR        : '*' ;
CSS_SLASH       : '/' ;
CSS_IMPORTANT   : '!important' ;

// #fff  أو  #header  (نفس الشكل، الـ parser بيعرف من المكان)
CSS_HASH        : '#' [a-zA-Z0-9_\-]+ ;

// 10px  1.5em  50%  0
CSS_NUMBER      : '-'? [0-9]+ ('.' [0-9]+)? ( [a-zA-Z]+ | '%' )? ;

CSS_STRING      : '"' ~["]* '"'
                | '\'' ~[']* '\''
                ;

CSS_IDENT       : '-'? [a-zA-Z_] [a-zA-Z0-9_\-]* ;
