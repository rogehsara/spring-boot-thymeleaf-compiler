// Lexer لملفات Java (Spring Boot Controllers + Models)
// ما عملنا كل لغة Java، بس الأشياء اللي منحتاجها بالمشروع
lexer grammar JavaLexer;

// ---------- الكلمات المحجوزة ----------
PACKAGE     : 'package';
IMPORT      : 'import';
CLASS       : 'class';
INTERFACE   : 'interface';
EXTENDS     : 'extends';
IMPLEMENTS  : 'implements';
PUBLIC      : 'public';
PRIVATE     : 'private';
PROTECTED   : 'protected';
STATIC      : 'static';
FINAL       : 'final';
ABSTRACT    : 'abstract';
VOID        : 'void';
RETURN      : 'return';
IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
BREAK       : 'break';
CONTINUE    : 'continue';
NEW         : 'new';
THIS        : 'this';
SUPER       : 'super';
INSTANCEOF  : 'instanceof';
TRUE        : 'true';
FALSE       : 'false';
NULL        : 'null';

// الأنواع الأساسية
INT         : 'int';
LONG        : 'long';
DOUBLE      : 'double';
FLOAT       : 'float';
BOOLEAN     : 'boolean';
CHAR        : 'char';
BYTE        : 'byte';
SHORT       : 'short';

// ---------- الرموز ----------
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';
LBRACK      : '[';
RBRACK      : ']';
SEMI        : ';';
COMMA       : ',';
DOT         : '.';
AT          : '@';
ARROW       : '->';
COLONCOLON  : '::';
COLON       : ':';
QUESTION    : '?';

// العمليات
ADD_ASSIGN  : '+=';
SUB_ASSIGN  : '-=';
EQ          : '==';
NE          : '!=';
LE          : '<=';
GE          : '>=';
AND         : '&&';
OR          : '||';
INC         : '++';
DEC         : '--';
ASSIGN      : '=';
LT          : '<';
GT          : '>';
NOT         : '!';
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
MOD         : '%';

// ---------- القيم الثابتة ----------
FLOAT_LITERAL   : DIGIT+ '.' DIGIT+ [fFdD]? ;
INT_LITERAL     : DIGIT+ [lL]? ;
STRING_LITERAL  : '"' ( ~["\\\r\n] | '\\' . )* '"' ;
CHAR_LITERAL    : '\'' ( ~['\\\r\n] | '\\' . ) '\'' ;

// ---------- الأسماء ----------
// لازم يكون بعد الكلمات المحجوزة مشان الكلمات المحجوزة تاخد الأولوية
IDENTIFIER  : LETTER (LETTER | DIGIT)* ;

// ---------- أشياء منتجاهلها ----------
LINE_COMMENT  : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/'  -> skip ;
WS            : [ \t\r\n]+     -> skip ;

fragment DIGIT  : [0-9] ;
fragment LETTER : [a-zA-Z_$] ;
