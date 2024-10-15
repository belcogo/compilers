/* Bel Cogo e Joao Vitor Accorsi */

%%
%class LexicAnalyzerFOOL
%public
%standalone
%unicode

/* Define tokens */
%{

%}

/* Regular expressions */
ARITMETIC_OPERATOR      = (\+|\*)
LOGIC_OPERATOR          = (not|and|or)
RELATIONAL_OPERATOR     = (==|<|>)
ATTRIBUITION_OPERATOR   = \=

RESERVED_WORD           = (class|if|else|return)
TYPE                    = (bool|int)
METHOD_TYPE             = (TYPE|void)

PARENTHESIS_OPEN        = \(
PARENTHESIS_CLOSE       = \)
CURLY_BRACES_OPEN       = \{
CURLY_BRACES_CLOSE      = \}
COMMA                   = \,
SEMICOLON               = \;

BOOLEAN_CONSTANTS       = (True|False)
NUMBER                  = ([0-9]+)
IDENTIFIER              = ([a-zA-Z_][a-zA-Z0-9_]*)
%%


/* Rules for token recognition */
{ARITMETIC_OPERATOR}        {System.out.println(yytext() + " é da classe OPERADOR ARITMÉTICO");}
{LOGIC_OPERATOR}            {System.out.println(yytext() + " é da classe OPERADOR LÓGICO");}
{RELATIONAL_OPERATOR}       {System.out.println(yytext() + " é da classe OPERADOR RELACIONAL");}
{ATTRIBUITION_OPERATOR}     {System.out.println(yytext() + " é da classe OPERADOR DE ATRIBUIÇÃO");}

{RESERVED_WORD}             {System.out.println(yytext() + " é da classe PALAVRA RESERVADA");}
{TYPE}                      {System.out.println(yytext() + " é da classe TIPO DE ATRIBUTO ou MÉTODO");}
{METHOD_TYPE}               {System.out.println(yytext() + " é da classe TIPO DE MÉTODO");}

{PARENTHESIS_OPEN}          {System.out.println(yytext() + " é da classe ABRE PARÊNTESES");}
{PARENTHESIS_CLOSE}         {System.out.println(yytext() + " é da classe FECHA PARÊNTESES");}
{CURLY_BRACES_OPEN}         {System.out.println(yytext() + " é da classe ABRE CHAVES");}
{CURLY_BRACES_CLOSE}        {System.out.println(yytext() + " é da classe FECHA CHAVES");}
{COMMA}                     {System.out.println(yytext() + " é da classe VÍRGULA");}
{SEMICOLON}                 {System.out.println(yytext() + " é da classe PONTO E VÍRGULA");}

{BOOLEAN_CONSTANTS}         {System.out.println(yytext() + " é da classe CONSTANTE BOOLEANA");}
{NUMBER}                    {System.out.println(yytext() + " é da classe NÚMERO");}
{IDENTIFIER}                {System.out.println(yytext() + " é da classe IDENTIFICADOR");}