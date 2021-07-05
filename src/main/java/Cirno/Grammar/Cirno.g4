grammar Cirno;
import Tokens;

inicio  // exemplo: func vazio inicio(){ ... }
    :PROCEDIMENTO VAZIO PROCEDIMENTOPRINCIPAL INICIO_PARENTESES declaracao* FIM_PARENTESES INICIO_CHAVES (blocoDeComando)? FIM_CHAVES
    ;

declaracao  // exemplo:inteiro : num;
    :tipoPrimitivo SEPARADOR_DEFINICAO_VARIAVEL identifier=ID FIM_LINHA
    ;

atribuicao // exemplo: num := 1;
    :identifier=ID ATRIBUICAO (identifier=ID | VALOR ) FIM_LINHA
    ;

declaracaoComAtribuicao // exemplo: inteiro : num := 1;
    :tipoPrimitivo SEPARADOR_DEFINICAO_VARIAVEL ATRIBUICAO identifier=ID FIM_LINHA
    ;

declaracaoDeVariavel
    : (declaracao | declaracaoComAtribuicao | atribuicao)
    ;

blocoDeComando
    : (declaracaoDeVariavel | operacoes | declaracoes | comando)*
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
    : LEIA INICIO_PARENTESES VALOR FIM_PARENTESES
    ;
funcaoEscrever  //exemplo: imprima ("");
    : IMPRIMA INICIO_PARENTESES (ID | VALOR)* FIM_PARENTESES
    ;

operacoes
    : operacaoMatematicaInteiros    #operacaoInteiro
    | operacaoMatematicaRacional    #operacaoRacional
    ;

operacaoMatematicaInteiros  //necessario Verificar se esta correto
    : operacaoMatematicaInteiros operacaoAritmetica (INTEIRO | INTEIRO_POSITIVO | INTEIRO_NEGATIVO)
    | (INTEIRO | INTEIRO_POSITIVO | INTEIRO_NEGATIVO)
    ;
operacaoMatematicaRacional
    : operacaoMatematicaRacional operacaoAritmetica (RACIONAL | RACIONAL_POSITIVO | RACIONAL_NEGATIVO)
    | (RACIONAL | RACIONAL_POSITIVO | RACIONAL_NEGATIVO)
    ;
 /*    Declaracoes   */
declaracoes //tipos de declaracao
    : declaracaoSe
    | declaracaoPara
    | declaracaoRepitaEnquanto
    | declaracaoEnquantoExecute
    | declaracaoQuandoFor
    ;

condicional
    : (operadorLogicoUnitario)?(ID | VALOR) operacaoRelacao (operadorLogicoUnitario)?(ID | VALOR) (operadorLogicoBinario condicional)?
    ;

/*  declaracao Se Contudo    */
declaracaoSe // Forma se-contudo. Exemplo: se(1>2){a=1} contudo{a=2}
    : inicioSe (seEntao)?
    ;
inicioSe
    : SE INICIO_PARENTESES condicional FIM_PARENTESES INICIO_CHAVES blocoDeComando? FIM_CHAVES   //SE demostracaoCondicional blocoDeComando
    ;
seEntao
    : CONTUDO INICIO_CHAVES blocoDeComando? FIM_CHAVES
    ;

/*  Declaracao Para  */
declaracaoPara  //exemplo: para(inicio,fim,incremento) { blocoDeComando }
    : PARA condicionalPara INICIO_CHAVES (blocoDeComando)? FIM_CHAVES
    ;

condicionalPara
    :INICIO_PARENTESES condicionalInicioPara SEPARADOR_PARAMETRO condicional SEPARADOR_PARAMETRO condicionalIncrementoPara FIM_PARENTESES
    ;
condicionalInicioPara
    : declaracaoComAtribuicao
    | atribuicao
    | ID
    ;
condicionalIncrementoPara
    : operacoes // Verificar se está certo
    ;

/* Declaracao Repita Enquanto*/
declaracaoRepitaEnquanto // exemplo repita{ blocoDeComando } enquanto( condicao )
    : REPITA INICIO_CHAVES blocoDeComando? FIM_CHAVES ENQUANTO INICIO_PARENTESES condicional FIM_PARENTESES
    ;


/*  Declaracao Enquanto Execute    */
declaracaoEnquantoExecute   // exemplo: enquanto(condicao)execute{ bloco de comando }
    : ENQUANTO INICIO_PARENTESES condicional FIM_PARENTESES EXECUTE INICIO_CHAVES blocoDeComando? FIM_CHAVES
    ;

/* Declaracao Quando For */
declaracaoQuandoFor // exemplo: quando(variavel): for(){} ... finalize;
    : inicioQuandoFor (forFor)+ FINALIZE FIM_LINHA
    ;

inicioQuandoFor
    : QUANDO INICIO_PARENTESES ID FIM_PARENTESES SEPARADOR_DEFINICAO_VARIAVEL
    ;

forFor
    : FOR NICIO_PARENTESES ID FIM_PARENTESES INICIO_CHAVES blocoDeComando? FIM_CHAVES
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
    : operacaoMultiplicacao
    | operacaoAdicao
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

/*  Operacoes Logicos */
operadorLogicoBinario
    : E
    | OU
    ;

operadorLogicoUnitario
    : NAO
    ;
