grammar SyntacticAnalyser;

NEWLINE:                [ \t\r\n]+ -> skip;
RESERVED_WORD_MAIN:     'main';
RESERVED_WORD_VOID_TYPE:'void';
RESERVED_WORD_CLASS:    'class';
RESERVED_WORD_RETURN:   'return';
RESERVED_WORD_IF:       'if';
RESERVED_WORD_ELSE:     'else';
RESERVED_WORD_WHILE:    'while';
type:                   ('bool'|'int');
method_type:            (type|RESERVED_WORD_VOID_TYPE);
PARENTHESIS_OPEN:       '(';
PARENTHESIS_CLOSE:      ')';
CURLY_BRACES_OPEN:      '{';
CURLY_BRACES_CLOSE:     '}';
COMMA:                  ',';
SEMICOLON:              ';';
boolean_constants:      ('True'|'False');
NUMBER:                 ([0-9]+);
IDENTIFIER:             ([a-zA-Z_][a-zA-Z0-9_]*);
exp_two:                aritmetic_op | logic_op | relational_op | exp_three | exp_four;
ATTRIBUITION_OPERATOR:  '=';
exp_one:                ATTRIBUITION_OPERATOR exp_two SEMICOLON | SEMICOLON;
attr_declaration:       type IDENTIFIER exp_one | type IDENTIFIER SEMICOLON | type IDENTIFIER;
arguments:              attr_declaration COMMA arguments | attr_declaration;
main_function:          RESERVED_WORD_VOID_TYPE RESERVED_WORD_MAIN PARENTHESIS_OPEN PARENTHESIS_CLOSE CURLY_BRACES_OPEN (method_declaration | commands | ifelse | while_command)* CURLY_BRACES_CLOSE;
method_declaration:     method_type IDENTIFIER PARENTHESIS_OPEN arguments PARENTHESIS_CLOSE CURLY_BRACES_OPEN (commands | ifelse | while_command)* CURLY_BRACES_CLOSE;
while_command:          RESERVED_WORD_WHILE PARENTHESIS_OPEN (logic_op) PARENTHESIS_CLOSE CURLY_BRACES_OPEN (commands | ifelse | while_command)* CURLY_BRACES_CLOSE;
class:                  RESERVED_WORD_CLASS IDENTIFIER CURLY_BRACES_OPEN (attr_declaration | method_declaration)* CURLY_BRACES_CLOSE 
                        | RESERVED_WORD_CLASS IDENTIFIER CURLY_BRACES_OPEN CURLY_BRACES_CLOSE;
if:                     RESERVED_WORD_IF PARENTHESIS_OPEN (IDENTIFIER | logic_op) PARENTHESIS_CLOSE (commands | ifelse | while_command) SEMICOLON;
else:                   RESERVED_WORD_ELSE (commands | ifelse | while_command) SEMICOLON;
ifelse:                 if | if else;
commands:               attr_declaration commands | attr_declaration | RESERVED_WORD_RETURN IDENTIFIER SEMICOLON
                        | RESERVED_WORD_RETURN exp_two SEMICOLON
                        | IDENTIFIER PARENTHESIS_OPEN (exp_three COMMA | exp_three)* PARENTHESIS_CLOSE SEMICOLON
                        | IDENTIFIER ATTRIBUITION_OPERATOR (logic_op | aritmetic_op) SEMICOLON;
exp_three:              IDENTIFIER | NUMBER;
LOGIC_OPERATOR:         ('not'|'and'|'or');
ARITMETIC_OPERATOR:     ('+'|'*');
aritmetic_op:           exp_three ARITMETIC_OPERATOR exp_three | exp_three ARITMETIC_OPERATOR PARENTHESIS_OPEN aritmetic_op PARENTHESIS_CLOSE | exp_three;
exp_four:               IDENTIFIER | boolean_constants;
logic_op:               exp_four LOGIC_OPERATOR exp_four | exp_four LOGIC_OPERATOR PARENTHESIS_OPEN logic_op PARENTHESIS_CLOSE | relational_op | exp_four;
RELATIONAL_OPERATOR:    ('=='|'<'|'>');
relational_op:          exp_three RELATIONAL_OPERATOR exp_three | exp_three RELATIONAL_OPERATOR PARENTHESIS_OPEN relational_op PARENTHESIS_CLOSE;
prog:                   (class | main_function) EOF;