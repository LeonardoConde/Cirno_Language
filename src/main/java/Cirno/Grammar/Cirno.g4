grammar Cirno;
import Tokens;

inicio  // exemplo: func vazio inicio(){ ... }
    :PROCEDIMENTO VAZIO PROCEDIMENTOPRINCIPAL INICIO_PARENTESES declaracao* FIM_PARENTESES INICIO_CHAVES blocoDeComando FIM_CHAVES
    ;

declaracao  // exemplo:inteiro : num;
    :tipoPrimitivo SEPARADOR_DEFINICAO_VARIAVEL ID FIM_LINHA
    ;

atribuicao // exemplo: num := 1;
    :identifier=ID ATRIBUICAO identifier=ID FIM_LINHA
    ;

declaracaoComAtribuicao // exemplo: inteiro : num := 1;
    :tipoPrimitivo SEPARADOR_DEFINICAO_VARIAVEL ID ATRIBUICAO identifier=ID FIM_LINHA
    ;

declaracaoDeVariavel
    : (declaracao | declaracaoComAtribuicao | atribuicao)*
    ;

blocoDeComando
    : declaracaoDeVariavel | 'comando' | operacoes
    ;

comando
    : funcoes FIM_LINHA
    ;

funcoes
    : funcaoLer
    | funcaoEscrever
   // | identifier=ID INICIO_PARENTESES params? FIM_PARENTESES
    ;

funcaoLer       //exemplo: leia(tipo);
    : LEIA INICIO_PARENTESES tipoPrimitivo FIM_PARENTESES
    ;
funcaoEscrever  //exemplo: imprima ("");
    : IMPRIMA INICIO_PARENTESES (tipoPrimitivo)* FIM_PARENTESES
    ;

operacoes
    : operacaoMatematicaInteiros
    ;

operacaoMatematicaInteiros  //necessario Verificar se esta correto
    :operacaoMatematicaInteiros operacaoAritmetica INTEIRO
    |INTEIRO operacaoAritmetica INTEIRO
    ;

 /*    Declaracoes   */
 /*
declaracoes //tipos de declaracao
    : declaracaoSe
   // | declaracaoPara
   // | declaracaoRepitaEnquanto
   // | declaracaoEnquantoExecute
   // | declaracaoQuandoFor
    ;

demostracaoCondicional
    : INICIO_PARENTESES operacacaoLogica FIM_PARENTESES
    ;

operacacaoLogica
    : INICIO_PARENTESES operacacaoLogica FIM_PARENTESES
    | operator = operadorLogicoUnitario operacacaoLogica
    | operacacaoLogica operator = operadorLogicoBinario operacacaoLogica
   // | booleanExpression
   // | relationalOperation
    ;
*/
/*
declaracaoSe // Forma se-contudo. Exemplo: se(1>2){a=1} contudo{a=2}
    : inicioSe seEntao seContudoSe
    ;

inicioSe
    : SE demostracaoCondicional
    ;

seEntao
    : CONTUDO blocoDeComando
    ;
seContudo
    : CONTUDO blocoDeComando FIM_LINHA
    ;
seContudoSe
    : contudoSe
    | seContudo
    | FIM_LINHA
    ;
contudoSe
    : CONTUDO declaracaoSe
    ;
*/

operadorLogicoBinario
    : E
    | OU
    ;

operadorLogicoUnitario
    : NAO
    ;

/*  Tipos primitivos */
tipoPrimitivo   // variaveis primitivas
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

/*    Operacoes aritmeticas */
operacaoAritmetica  //operacoes aritmeticas
    : operacaoAdicao
    | operacaoMultiplicacao
    ;
operacaoAdicao      //operacao de adicao
    : SOMA
    | SUBTRACAO
    ;
operacaoMultiplicacao   //operacao de multiplicacao
    : MULTIPLICACAO
    | DIVISAO
    | MODULO
    ;

/*     Operacoes de relacao */
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



