grammar SyntacticAnalyser;

MAIN:                   'main';
VOID:                   'void';
CLASS:                  'class';
RETURN:                 'return';
IF:                     'if';
ELSE:                   'else';
WHILE:                  'while';
PARENTHESIS_OPEN:       '(';
PARENTHESIS_CLOSE:      ')';
CURLY_BRACES_OPEN:      '{';
CURLY_BRACES_CLOSE:     '}';
COMMA:                  ',';
SEMICOLON:              ';';
BOOL:                   'bool';
INT:                    'int';
AND:                    'and';
OR:                     'or';
NOT:                    'not';
PLUS:                   '+';
MULTIPLY:               '*';
ATTRIBUITION_OPERATOR:  '=';
LESS_TAN:               '<';
GREATER_THAN:           '>';
EQUALS:                 '==';
NUMBER:                 ([0-9]+);
TRUE:                   'True';
FALSE:                  'False';
IDENTIFIER:             ([a-zA-Z_][a-zA-Z0-9_]*);
NEWLINE:                [ \t\r\n]+ -> skip;

type:                   (BOOL | INT);
method_type:            (type | VOID);

term:                   TRUE | FALSE | IDENTIFIER | PARENTHESIS_OPEN boolean_op PARENTHESIS_CLOSE | NOT term | method_call;
b_term:                 term ((AND | EQUALS | GREATER_THAN | LESS_TAN) term)*;
boolean_op:             b_term ((OR) b_term)*;

a_term:                 IDENTIFIER | NUMBER | method_call;
aritmetic_op:           a_term ((PLUS | MULTIPLY) a_term)*;

expression:             aritmetic_op | boolean_op | method_call;

method_call:            IDENTIFIER PARENTHESIS_OPEN (IDENTIFIER (COMMA IDENTIFIER)*)? PARENTHESIS_CLOSE;

else:                   ELSE CURLY_BRACES_OPEN (commands)* CURLY_BRACES_CLOSE;
ifelse:                 IF PARENTHESIS_OPEN boolean_op PARENTHESIS_CLOSE CURLY_BRACES_OPEN (commands)* CURLY_BRACES_CLOSE (else)?;

while:                  WHILE PARENTHESIS_OPEN boolean_op PARENTHESIS_CLOSE CURLY_BRACES_OPEN (commands)* CURLY_BRACES_CLOSE;

param:                  type IDENTIFIER (COMMA IDENTIFIER)*;

method_declaration:     method_type IDENTIFIER PARENTHESIS_OPEN (param (COMMA param)*)? PARENTHESIS_CLOSE CURLY_BRACES_OPEN (commands)* CURLY_BRACES_CLOSE;

attr_declaration:       type IDENTIFIER (ATTRIBUITION_OPERATOR expression)? SEMICOLON;

attribuition_op:        IDENTIFIER ATTRIBUITION_OPERATOR expression SEMICOLON;

commands:               attribuition_op | attr_declaration | method_declaration | while | ifelse | method_call SEMICOLON | RETURN expression SEMICOLON;

main_function:          VOID MAIN PARENTHESIS_OPEN PARENTHESIS_CLOSE CURLY_BRACES_OPEN (commands)* CURLY_BRACES_CLOSE;

class:                  CLASS IDENTIFIER PARENTHESIS_OPEN PARENTHESIS_CLOSE CURLY_BRACES_OPEN (main_function)? (commands)* CURLY_BRACES_CLOSE;

prog:                   class EOF;