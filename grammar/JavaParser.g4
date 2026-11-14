
parser grammar JavaParser;

options { tokenVocab = JavaLexer; }

// ================= بنية الملف =================

compilationUnit
    : packageDeclaration? importDeclaration* classDeclaration* EOF
    ;

packageDeclaration
    : PACKAGE qualifiedName SEMI
    ;

importDeclaration
    : IMPORT STATIC? qualifiedName (DOT MUL)? SEMI
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

// ================= الصف =================

classDeclaration
    : annotation* modifier* (CLASS | INTERFACE) IDENTIFIER
      (EXTENDS type)?
      (IMPLEMENTS type (COMMA type)*)?
      classBody
    ;

modifier
    : PUBLIC
    | PRIVATE
    | PROTECTED
    | STATIC
    | FINAL
    | ABSTRACT
    ;

classBody
    : LBRACE classMember* RBRACE
    ;

classMember
    : constructorDeclaration
    | methodDeclaration
    | fieldDeclaration
    | SEMI
    ;

// private List<Product> products = new ArrayList<>();
fieldDeclaration
    : annotation* modifier* type variableDeclarator (COMMA variableDeclarator)* SEMI
    ;

variableDeclarator
    : IDENTIFIER (ASSIGN expression)?
    ;

// public Product(String name) { ... }
constructorDeclaration
    : annotation* modifier* IDENTIFIER LPAREN parameterList? RPAREN block
    ;

// @GetMapping("/products") public String list(Model model) { ... }
methodDeclaration
    : annotation* modifier* (type | VOID) IDENTIFIER LPAREN parameterList? RPAREN (block | SEMI)
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

// @PathVariable("id") Long id
parameter
    : annotation* FINAL? type IDENTIFIER
    ;

// ================= Annotations =================

// @Controller
// @GetMapping("/products")
// @RequestParam(name = "id", required = false)
annotation
    : AT qualifiedName (LPAREN annotationArguments? RPAREN)?
    ;

annotationArguments
    : annotationPair (COMMA annotationPair)*
    | expression
    ;

annotationPair
    : IDENTIFIER ASSIGN expression
    ;

// ================= الأنواع =================

type
    : (primitiveType | classType) (LBRACK RBRACK)*
    ;

primitiveType
    : INT | LONG | DOUBLE | FLOAT | BOOLEAN | CHAR | BYTE | SHORT
    ;

// List<Product> , Map<String, List<Product>> , ArrayList<>
classType
    : qualifiedName typeArguments?
    ;

typeArguments
    : LT (type (COMMA type)*)? GT
    ;

// ================= التعليمات =================

block
    : LBRACE statement* RBRACE
    ;

statement
    : block                                                             # blockStatement
    | localVariableDeclaration SEMI                                     # localVarStatement
    | IF LPAREN expression RPAREN statement (ELSE statement)?           # ifStatement
    | FOR LPAREN type IDENTIFIER COLON expression RPAREN statement      # forEachStatement
    | FOR LPAREN forInit? SEMI expression? SEMI forUpdate? RPAREN statement   # forStatement
    | WHILE LPAREN expression RPAREN statement                          # whileStatement
    | RETURN expression? SEMI                                           # returnStatement
    | BREAK SEMI                                                        # breakStatement
    | CONTINUE SEMI                                                     # continueStatement
    | expression SEMI                                                   # expressionStatement
    | SEMI                                                              # emptyStatement
    ;

// Product p = new Product();
localVariableDeclaration
    : FINAL? type variableDeclarator (COMMA variableDeclarator)*
    ;

forInit
    : localVariableDeclaration
    | expression (COMMA expression)*
    ;

forUpdate
    : expression (COMMA expression)*
    ;

// ================= التعابير =================

expression
    : primary                                                   # primaryExpr
    | expression DOT IDENTIFIER LPAREN argumentList? RPAREN     # methodCallExpr
    | expression DOT IDENTIFIER                                 # fieldAccessExpr
    | expression COLONCOLON IDENTIFIER                          # methodRefExpr
    | expression LBRACK expression RBRACK                       # arrayAccessExpr
    | NEW classType LPAREN argumentList? RPAREN                 # newObjectExpr
    | expression (INC | DEC)                                    # postfixExpr
    | (NOT | SUB | INC | DEC) expression                        # unaryExpr
    | expression (MUL | DIV | MOD) expression                   # mulExpr
    | expression (ADD | SUB) expression                         # addExpr
    | expression (LT | GT | LE | GE) expression                 # relationalExpr
    | expression INSTANCEOF type                                # instanceofExpr
    | expression (EQ | NE) expression                           # equalityExpr
    | expression AND expression                                 # andExpr
    | expression OR expression                                  # orExpr
    | <assoc=right> expression QUESTION expression COLON expression       # ternaryExpr
    | <assoc=right> expression (ASSIGN | ADD_ASSIGN | SUB_ASSIGN) expression   # assignExpr
    ;

primary
    : LPAREN expression RPAREN                          # parenPrimary
    | lambda                                            # lambdaPrimary
    | IDENTIFIER LPAREN argumentList? RPAREN            # callPrimary
    | THIS                                              # thisPrimary
    | SUPER                                             # superPrimary
    | literal                                           # literalPrimary
    | IDENTIFIER                                        # identifierPrimary
    ;

// p -> p.getId().equals(id)
lambda
    : IDENTIFIER ARROW (expression | block)
    | LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN ARROW (expression | block)
    ;

argumentList
    : expression (COMMA expression)*
    ;

literal
    : INT_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    | TRUE
    | FALSE
    | NULL
    ;
