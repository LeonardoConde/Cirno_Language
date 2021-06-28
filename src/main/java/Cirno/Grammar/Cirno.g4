grammar Cirno;
import Tokens;

declaracao  // exemplo:inteiro : num;
    :tipoPrimitivo SEPARADOR_DEFINICAO_VARIAVEL ID FIM_LINHA
    ;

atribuicao // exemplo: num := 1;
    :identifier=ID ATRIBUICAO identifier=ID FIM_LINHA
    ;

declaracaoComAtribuicao // exemplo: inteiro : num := 1;
    :tipoPrimitivo SEPARADOR_DEFINICAO_VARIAVEL ID ATRIBUICAO identifier=ID FIM_LINHA
    ;

inicio  // exemplo: func vazio inicio(){ ... }
    :PROCEDIMENTO VAZIO PROCEDIMENTOPRINCIPAL INICIO_PARENTESES declaracao* FIM_PARENTESES INICIO_CHAVES blocoDeComando FIM_CHAVES
    ;

blocoDeComando
    :(declaracao | declaracaoComAtribuicao | atribuicao)*
    ;

operacaoMatematica
    :operacaoMatematica operacaoAritmetica NUMERO
    |
    |
    ;
/*
// Formas
statement
    : ifStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | switchStatement
    ;


statementCondition
    : INICIO_PARENTESES logicalOperation FIM_PARENTESES
    ;*/

tipoPrimitivo
    : INTEIRO
    | INTEIRO_POSITIVO
    | INTEIRO_NEGATIVO
    | RACIONAL
    | RACIONAL_POSITIVO
    | RACIONAL_NEGATIVO
    | CARACTERE
    | TEXTO
    | BOOLEANO
    ;

operacaoAritmetica
    : operacaoAdicao
    | operacaoMultiplicacao
    ;
operacaoAdicao
    : SOMA
    | SUBTRACAO
    ;
operacaoMultiplicacao
    : MULTIPLICACAO
    | DIVISAO
    | MODULO
    ;

operacaoRelacao
    : operacaoIgualdade
    | operacaoComparacao
    ;

operacaoIgualdade
    : IGUAL
    | DIFERENTE
    | MAIOR_IGUAL
    | MENOR_IGUAL
    ;
operacaoComparacao
    : MAIOR
    | MENOR
    ;

//----------------------------------------------------------------------
/*
file
    : procedureDeclarationBlock?                // procedimentos
      EOF
    ;

//Funcao Inicio
procedureDeclarationBlock:
      procedure*
      mainProcedure
      ;

// Declaracao de funcoes
procedure
    : procedureDeclaration procedureBody
    ;

procedureDeclaration
    : PROCEDIMENTO primitiveType 'vazio' identifier=ID INICIO_PARENTESES procedureInput? FIM_PARENTESES    /*Verificar o primitiveType
    ;
procedureBody
    : INICIO_CHAVES procedureBlock FIM_CHAVES
    ;
procedureBlock
    : block procedureOutput?
    ;
procedureInput
    : 'variableDeclaration+'
    ;
procedureOutput
    : RETORNO (VAZIO | ID)     /*Verificar
    ;
mainProcedure
    : PROCEDIMENTO /*primitiveType 'vazio' identifier=PROCEDIMENTOPRINCIPAL INICIO_PARENTESES procedureInput? FIM_PARENTESES procedureBody       /*Verificar o primitiveType
    ;

// Bloco de codigo com os comandos e formas
block
    : (variableDeclarationOrAssignment | 'command' | 'statement')*
    ;

// Declaracao de variaveis
variableDeclarationOrAssignment
    : ('variableDeclaration' | 'variableAssignment')
    ;
*/
/***********************************************************************************************************************/
/*
// Comandos

command
    : function FIM_LINHA
    | variableAssignment
    ;

// Formas
statement
    : ifStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | switchStatement
    ;

statementCondition
    : INICIO_PARENTESES logicalOperation FIM_PARENTESES
    ;

// Operacoes
relationalOperation
    : INICIO_PARENTESES relationalOperation FIM_PARENTESES                                  #priorityRelationalOperation
    | integerArithmeticOperation operator=relationalOperator integerArithmeticOperation     #integerRelationalOperation
    | rationalArithmeticOperation operator=comparisonOperator rationalArithmeticOperation   #rationalRelationalOperation
    | characterExpression operator=relationalOperator characterExpression                   #characterRelationalOperation
    | booleanExpression                                                                     #expressionRelationalOperation
    ;
logicalOperation
    : INICIO_PARENTESES logicalOperation FIM_PARENTESES                 #priorityLogicalOperation
    | operator=unaryLogicalOperator logicalOperation                    #unaryLogicalOperation
    | logicalOperation operator=binaryLogicalOperator logicalOperation  #binaryLogicalOperation
    | booleanExpression                                                 #expressionLogicalOperation
    | relationalOperation                                               #relationalLogicalOperation
    ;
integerArithmeticOperation
    : INICIO_PARENTESES integerArithmeticOperation FIM_PARENTESES                           #priorityIntegerArithmeticOperation
    | integerArithmeticOperation operator=multiplicativeOperator integerArithmeticOperation #integerMultiplicativeOperation
    | integerArithmeticOperation operator=additiveOperator integerArithmeticOperation       #integerAdditiveOperation
    | integerExpression                                                                     #expressionIntegerArithmeticOperation
    ;
rationalArithmeticOperation
    : integerArithmeticOperation                                                                        #integerExpressionRationalArithmeticOperation
    | INICIO_PARENTESES rationalArithmeticOperation FIM_PARENTESES                                      #priorityRationalArithmeticOperation
    | rationalArithmeticOperation operator=multiplicativeOperator rationalArithmeticOperation   #rationalMultiplicativeOperation
    | rationalArithmeticOperation operator=additiveOperator rationalArithmeticOperation                 #rationalAdditiveOperation
    | rationalExpression                                                                                #rationalExpressionRationalArithmeticOperation
    ;
concatenationOperation
    : INICIO_PARENTESES concatenationOperation FIM_PARENTESES       #priorityConcatenationOperation
    | concatenationOperation 'CONCATENACAO' concatenationOperation    #recursiveConcatenationOperation
    | characterExpression                                           #characterExpressionConcatenationOperation
    | numericalExpression                                           #numericalExpressionConcatenationOperation
    ;

operation
    : integerArithmeticOperation
    | rationalArithmeticOperation
    | logicalOperation
    | relationalOperation
    | concatenationOperation
    ;

// Declaracao e atribuicao de variaveis
variable
    : id=ID arrayDimention? (ATRIBUICAO variable)?
    ;


variableDeclaration
    : identifier=ID (SEPARADOR_VARIAVEL innerId=ID)* SEPARADOR_VARIAVEL_TIPO t=type FIM_LINHA
    ;

variableDeclaration
    : t=type SEPARADOR_DEFINICAO_VARIAVEL identifier=ID ATRIBUICAO ID FIM_LINHA
    ;
variableAssignment
    : variable ATRIBUICAO operation FIM_LINHA
    ;

// Tipos de expressoes
expression
    : booleanExpression
    | numericalExpression
    | characterExpression
    ;
booleanExpression
    : BOOLEANO
    | variable
    | function
    ;
numericalExpression
    : integerExpression
    | rationalExpression
    ;
integerExpression
    : 'NATURAL_LITERAL'
    | INTEIRO
    | variable
    | function
    ;
rationalExpression
    : RACIONAL
    | variable
    | function
    ;
characterExpression
    : CARACTERE
    | TEXTO
    | variable
    | function
    ;

// Funcoes pre-definidas
function
    : readFunction
    | writeFunction
    | identifier=ID INICIO_PARENTESES params? FIM_PARENTESES
    ;
params
    : expression (ATRIBUICAO expression)*
    ;
readFunction
    : LEIA INICIO_PARENTESES FIM_PARENTESES
    ;
writeFunction
    : ESCREVA INICIO_PARENTESES parameters=params? FIM_PARENTESES
    ;

// Forma se-contudo
ifStatement
    : ifStart ifThen ifElseIf
    ;
ifStart
    : SE statementCondition
    ;
ifThen
    : CONTUDO block
    ;
ifElse
    : CONTUDO block FIM_LINHA
    ;
ifElseIf
    : elseIf
    | ifElse
    | FIM_LINHA
    ;
elseIf
    : CONTUDO ifStatement
    ;

// Forma encadeamento se-contudo
switchStatement
    : switchStart switchCases+ switchDefault? FIM_LINHA
    ;
switchStart
    : QUANDO variable 'SEJA'
    ;
switchCases
    : expression ('SEPARADOR_VARIAVEL' expression)* 'SEPARADOR_VARIAVEL_TIPO' block
    ;
switchDefault
    : CONTUDO block
    ;

// Forma para
forStatement
    : forStart forInterval forStep forBlock
    ;
forStart
    : PARA INICIO_PARENTESES variable
    ;
forInterval
    : SEPARADOR_PARAMETRO numericalExpression 'ATE' numericalExpression
    ;
forStep
    : SEPARADOR_PARAMETRO numericalExpression
    ;
forBlock
    : block FIM_LINHA
    ;

// Forma enquanto
whileStatement
    : whileStart whileBlock
    ;
whileStart
    : ENQUANTO statementCondition
    ;
whileBlock
    : EXECUTE block FIM_LINHA
    ;

// Forma ate que
doWhileStatement
    : doWhileBlock doWhileEnd
    ;
doWhileBlock
    : REPITA block
    ;
doWhileEnd
    : ENQUANTO statementCondition FIM_LINHA
    ;

// Variaveis
typeDefinitionType
    : primitiveType
    | typeDefinitionType arrayDimentionLiteral
    | ID
    ;

type
    : primitiveType
    | type arrayDimention
    | ID
    ;

primitiveType:INTEIRO | INTEIRO_POSITIVO | INTEIRO_NEGATIVO | RACIONAL | RACIONAL_POSITIVO | RACIONAL_NEGATIVO | CARACTERE | TEXTO | BOOLEANO;

arrayDimention
    : INICIO_CHAVES variable FIM_CHAVES    #variableArrayDimention
    | arrayDimentionLiteral                 #literalArrayDimention
    ;
arrayDimentionLiteral
    : INICIO_CHAVES INTEIRO FIM_CHAVES
    ;

// Operadores
binaryOperator
    : relationalOperator
    | arithmeticOperator
    | binaryLogicalOperator
    ;

unaryLogicalOperator
    : NAO
    ;
binaryLogicalOperator
    : E
    | OU
    ;
*/