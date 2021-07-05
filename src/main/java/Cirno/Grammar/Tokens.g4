lexer grammar Tokens;

//PROCEDIMENTOS
PROCEDIMENTO : 'func' ;
PROCEDIMENTOPRINCIPAL : 'inicio' ;

//TIPOS DE RETORNOS
//Tipos primitivos
INTEIRO : 'inteiro' ;
INTEIRO_POSITIVO : 'inteiro+' ;
INTEIRO_NEGATIVO : 'inteiro-' ;
RACIONAL : 'racional' ;
RACIONAL_POSITIVO : 'racional+' ;
RACIONAL_NEGATIVO : 'racional-' ;
CARACTERE : 'caractere';
TEXTO : 'texto' ;
BOOLEANO : 'booleano' ;

//tipos não-variaveis
VAZIO : 'vazio';

//PALAVRAS RESERVADAS
//condicionais
SE : 'se' ;
CONTUDO : 'contudo' ;
QUANDO : 'quando' ;
FINALIZE : 'finalize' ;
FOR : 'for';
//loops
PARA : 'para'    ;
ENQUANTO : 'enquanto' ;
EXECUTE : 'execute' ;
REPITA: 'repita'  ;
//atribuição
ATRIBUICAO:':=';
//retorno
RETORNO:'retorno';
//fuções pré-existentes
LEIA : 'leia';
IMPRIMA : 'imprima';

//operadores
//logicos
E : '&&';
OU : 'OR';
NAO : '!' ;
//relacionais
IGUAL : '==' ;
DIFERENTE : '!=' ;
MAIOR : '>' ;
MENOR : '<' ;
MAIOR_IGUAL : '>=' ;
MENOR_IGUAL : '<=';
//aritméticos
SOMA : '+' ;
SUBTRACAO : '-' ;
MULTIPLICACAO : '*' ;
DIVISAO : '/' ;
MODULO : '%' ;
INCREMENTO : '++' ;
DECREMENTO : '--' ;

//DELEMITADORES
//linha
FIM_LINHA:';';
//parenteses
INICIO_PARENTESES : '(' ;
FIM_PARENTESES : ')' ;
//colchete
INICIO_COLCHETE :'[';
FIM_COLCHETE: ']' ;
//chaves
INICIO_CHAVES: '{' ;
FIM_CHAVES:'}';
//argumetos
SEPARADOR_PARAMETRO: ',' ;
//tipo da variavel
SEPARADOR_DEFINICAO_VARIAVEL:':';

// Valor
VALOR:
    |DEFINICAO_INTEIRO
    |DEFINICAO_INTEIRO_POSITIVO
    |DEFINICAO_INTEIRO_NEGATIVO
    |DEFINICAO_RACIONAL
    |DEFINICAO_RACIONAL_POSITIVO
    |DEFINICAO_RACIONAL_NEGATIVO
    |DEFINICAO_CARACTERE
    |DEFINICAO_TEXTO
    |DEFINICAO_BOOLEANO
    ;

//definicao dos tipos-primitvos
DEFINICAO_INTEIRO : ZERO+ //nunca -0
                  | SINAL? NUMERO+;
DEFINICAO_INTEIRO_POSITIVO : ZERO+ //nunca -0
                           | POSITIVO? NUMERO+; //nunca -0
DEFINICAO_INTEIRO_NEGATIVO : ZERO+
                           | NEGATIVO ZERO* NAO_ZERO NUMERO*;
DEFINICAO_RACIONAL : ZERO+'.'ZERO+
                   | SINAL? ZERO* NAO_ZERO NUMERO*'.' NUMERO+
                   | SINAL? ZERO+'.'NAO_ZERO* NUMERO NAO_ZERO*;
DEFINICAO_RACIONAL_POSITIVO : ZERO+'.'ZERO+
                            | POSITIVO? ZERO* NAO_ZERO NUMERO*'.' NUMERO+
                            | POSITIVO? ZERO+'.'NAO_ZERO* NUMERO NAO_ZERO*;
DEFINICAO_RACIONAL_NEGATIVO : ZERO'.'ZERO+
                            | NEGATIVO ZERO* NAO_ZERO NUMERO*'.' NUMERO+
                            | NEGATIVO ZERO+'.'NAO_ZERO* NUMERO NAO_ZERO*;
DEFINICAO_CARACTERE: '\'' CARACTER '\'';
DEFINICAO_TEXTO:'"' CARACTER*? '"';
DEFINICAO_BOOLEANO: VERDADEIRO|FALSO;

//Definição de valores
fragment SINAL: POSITIVO | NEGATIVO;
fragment POSITIVO:'+';
fragment NEGATIVO:'-';
fragment VERDADEIRO:'verdadeiro';
fragment FALSO:'falso';
fragment ZERO: '0';
fragment NAO_ZERO: [1-9];
fragment NUMERO: ZERO | NAO_ZERO;
fragment LETRA: [_a-zA-Z];
fragment CARACTER: ~['\\\n\r]   // qualquer caractere, menos \n, \r, ' e \
                 | ESCAPE;
fragment ESCAPE: '\\''b'     // backspace
               | '\\''t'     // tabulation
               | '\\''n'     // new line
               | '\\''f'     // form feed
               | '\\''r'     // carriage return
               | '\\''"'     // escaped "
               | '\\''\''    // escaped '
               | '\\''\\';   // escaped \
ID : LETRA (LETRA | NUMERO)* ;	// identificador de variavel - começa com letra
WS : [ \t\r\n]+ -> skip ;		// skip spaces, tabs, newlines