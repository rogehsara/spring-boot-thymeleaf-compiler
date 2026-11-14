
parser grammar HTMLParser;

options { tokenVocab = HTMLLexer; }

// ===================== HTML =====================

document
    : DOCTYPE? content EOF
    ;

content
    : (element | styleElement | HTML_TEXT)*
    ;

element
    // <div ...> ... </div>
    : TAG_OPEN TAG_NAME attribute* TAG_CLOSE content TAG_OPEN_SLASH TAG_NAME TAG_CLOSE   # normalElement
    // <div ... />
    | TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE                                       # selfClosingElement
    // <input ...>  أو  <input ... />
    | TAG_OPEN VOID_TAG_NAME attribute* (TAG_CLOSE | TAG_SLASH_CLOSE)                    # voidElement
    ;

attribute
    : thAttribute                               # thymeleafAttribute
    | TAG_NAME (TAG_EQUALS ATTR_VALUE)?         # htmlAttribute
    ;

// th:text="${p.name}"
thAttribute
    : TH_ATTR_NAME TH_EQUALS TH_QUOTE_OPEN thValue TH_QUOTE_CLOSE
    ;

// ===================== Thymeleaf =====================

thValue
    : eachExpression            // p : ${products}
    | thExpression
    ;

// th:each="p : ${products}"   أو   th:each="p, stat : ${products}"
eachExpression
    : TH_ID (TH_COMMA TH_ID)? TH_COLON thExpression
    ;

thExpression
    : thPrimary                                                     # thPrimaryExpr
    | (TH_NOT | TH_NOT_WORD | TH_MINUS) thExpression                # thUnaryExpr
    | thExpression (TH_STAR | TH_SLASH | TH_PERCENT) thExpression   # thMulExpr
    | thExpression (TH_PLUS | TH_MINUS) thExpression                # thAddExpr
    | thExpression (TH_LT | TH_GT | TH_LE | TH_GE) thExpression     # thRelExpr
    | thExpression (TH_EQ | TH_NE) thExpression                     # thEqExpr
    | thExpression TH_AND thExpression                              # thAndExpr
    | thExpression TH_OR thExpression                               # thOrExpr
    | <assoc=right> thExpression TH_QUESTION thExpression TH_COLON thExpression      # thTernaryExpr
    ;

thPrimary
    : variableExpression
    | selectionExpression
    | linkExpression
    | messageExpression
    | thLiteral
    | TH_LPAREN thExpression TH_RPAREN
    ;

// ${product.name}
variableExpression
    : VAR_START ognlExpression TH_RBRACE
    ;

// *{name}
selectionExpression
    : SEL_START ognlExpression TH_RBRACE
    ;

// #{home.title}
messageExpression
    : MSG_START TH_ID (TH_DOT TH_ID)* TH_RBRACE
    ;

// @{/products}   @{/products/{id}(id=${p.id})}   @{${p.imageUrl}}
linkExpression
    : LINK_START linkUrl linkParameters? TH_RBRACE
    ;

linkUrl
    : (TH_SLASH urlPart?)+
    | variableExpression
    ;

urlPart
    : TH_ID (TH_DOT TH_ID)*         // products  أو  style.css
    | TH_LBRACE TH_ID TH_RBRACE     // {id}
    | TH_NUMBER
    ;

linkParameters
    : TH_LPAREN linkParameter (TH_COMMA linkParameter)* TH_RPAREN
    ;

linkParameter
    : TH_ID TH_ASSIGN thExpression
    ;

// ===================== التعابير جوا ${ } =====================
// product.name   products.size()   #lists.isEmpty(products)   p.price * 2

ognlExpression
    : ognlPrimary                                                       # ognlPrimaryExpr
    | (TH_NOT | TH_NOT_WORD | TH_MINUS) ognlExpression                  # ognlUnaryExpr
    | ognlExpression (TH_STAR | TH_SLASH | TH_PERCENT) ognlExpression   # ognlMulExpr
    | ognlExpression (TH_PLUS | TH_MINUS) ognlExpression                # ognlAddExpr
    | ognlExpression (TH_LT | TH_GT | TH_LE | TH_GE) ognlExpression     # ognlRelExpr
    | ognlExpression (TH_EQ | TH_NE) ognlExpression                     # ognlEqExpr
    | ognlExpression TH_AND ognlExpression                              # ognlAndExpr
    | ognlExpression TH_OR ognlExpression                               # ognlOrExpr
    ;

ognlPrimary
    : memberAccess
    | thLiteral
    | TH_LPAREN ognlExpression TH_RPAREN
    ;

// p.name  /  p.getName()  /  #lists.isEmpty(x)  /  list[0]
memberAccess
    : TH_HASH? TH_ID memberSuffix*
    ;

memberSuffix
    : TH_DOT TH_ID
    | TH_LPAREN (ognlExpression (TH_COMMA ognlExpression)*)? TH_RPAREN
    | TH_LBRACK ognlExpression TH_RBRACK
    ;

thLiteral
    : TH_STRING
    | TH_NUMBER
    | TH_TRUE
    | TH_FALSE
    | TH_NULL
    ;

// ===================== CSS =====================

styleElement
    : STYLE_OPEN cssRule* STYLE_CLOSE
    ;

// .card , #main { color: red; }
cssRule
    : selectorList CSS_LBRACE cssDeclaration* CSS_RBRACE
    ;

selectorList
    : selector (CSS_COMMA selector)*
    ;

// div p   /   ul > li   /   a:hover
selector
    : simpleSelector (CSS_GT? simpleSelector)*
    ;

simpleSelector
    : (CSS_IDENT | CSS_STAR) selectorSuffix*
    | selectorSuffix+
    ;

selectorSuffix
    : CSS_DOT CSS_IDENT          // .class
    | CSS_HASH                   // #id
    | CSS_COLON CSS_IDENT        // :hover
    ;

// color: red;
cssDeclaration
    : CSS_IDENT CSS_COLON cssValue+ CSS_IMPORTANT? CSS_SEMI
    ;

cssValue
    : CSS_IDENT
    | CSS_NUMBER
    | CSS_HASH
    | CSS_STRING
    | CSS_COMMA
    | CSS_SLASH
    | cssFunction
    ;

// rgb(0, 0, 0)
cssFunction
    : CSS_IDENT CSS_LPAREN cssValue* CSS_RPAREN
    ;
