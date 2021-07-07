// Generated from Cirno.g4 by ANTLR 4.9.2
package Cirno.Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CirnoParser}.
 */
public interface CirnoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CirnoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(CirnoParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(CirnoParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(CirnoParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(CirnoParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CirnoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CirnoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracaoComAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoComAtribuicao(CirnoParser.DeclaracaoComAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracaoComAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoComAtribuicao(CirnoParser.DeclaracaoComAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracaoDeVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoDeVariavel(CirnoParser.DeclaracaoDeVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracaoDeVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoDeVariavel(CirnoParser.DeclaracaoDeVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#blocoDeComando}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeComando(CirnoParser.BlocoDeComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#blocoDeComando}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeComando(CirnoParser.BlocoDeComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CirnoParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CirnoParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(CirnoParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(CirnoParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#funcaoLer}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoLer(CirnoParser.FuncaoLerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#funcaoLer}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoLer(CirnoParser.FuncaoLerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#funcaoEscrever}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoEscrever(CirnoParser.FuncaoEscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#funcaoEscrever}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoEscrever(CirnoParser.FuncaoEscreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(CirnoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(CirnoParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void enterOperacoes(CirnoParser.OperacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacoes}.
	 * @param ctx the parse tree
	 */
	void exitOperacoes(CirnoParser.OperacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#parametroOperacao}.
	 * @param ctx the parse tree
	 */
	void enterParametroOperacao(CirnoParser.ParametroOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#parametroOperacao}.
	 * @param ctx the parse tree
	 */
	void exitParametroOperacao(CirnoParser.ParametroOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(CirnoParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(CirnoParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(CirnoParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(CirnoParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracaoSe}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoSe(CirnoParser.DeclaracaoSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracaoSe}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoSe(CirnoParser.DeclaracaoSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#inicioSe}.
	 * @param ctx the parse tree
	 */
	void enterInicioSe(CirnoParser.InicioSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#inicioSe}.
	 * @param ctx the parse tree
	 */
	void exitInicioSe(CirnoParser.InicioSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#seEntao}.
	 * @param ctx the parse tree
	 */
	void enterSeEntao(CirnoParser.SeEntaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#seEntao}.
	 * @param ctx the parse tree
	 */
	void exitSeEntao(CirnoParser.SeEntaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracaoPara}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoPara(CirnoParser.DeclaracaoParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracaoPara}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoPara(CirnoParser.DeclaracaoParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#condicionalPara}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalPara(CirnoParser.CondicionalParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#condicionalPara}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalPara(CirnoParser.CondicionalParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#condicionalInicioPara}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalInicioPara(CirnoParser.CondicionalInicioParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#condicionalInicioPara}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalInicioPara(CirnoParser.CondicionalInicioParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#condicionalIncrementoPara}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalIncrementoPara(CirnoParser.CondicionalIncrementoParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#condicionalIncrementoPara}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalIncrementoPara(CirnoParser.CondicionalIncrementoParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoFor(CirnoParser.AtribuicaoForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoFor(CirnoParser.AtribuicaoForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#incrementoFor}.
	 * @param ctx the parse tree
	 */
	void enterIncrementoFor(CirnoParser.IncrementoForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#incrementoFor}.
	 * @param ctx the parse tree
	 */
	void exitIncrementoFor(CirnoParser.IncrementoForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracaoRepitaEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoRepitaEnquanto(CirnoParser.DeclaracaoRepitaEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracaoRepitaEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoRepitaEnquanto(CirnoParser.DeclaracaoRepitaEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracaoEnquantoExecute}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoEnquantoExecute(CirnoParser.DeclaracaoEnquantoExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracaoEnquantoExecute}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoEnquantoExecute(CirnoParser.DeclaracaoEnquantoExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#declaracaoQuandoFor}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoQuandoFor(CirnoParser.DeclaracaoQuandoForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#declaracaoQuandoFor}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoQuandoFor(CirnoParser.DeclaracaoQuandoForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#inicioQuandoFor}.
	 * @param ctx the parse tree
	 */
	void enterInicioQuandoFor(CirnoParser.InicioQuandoForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#inicioQuandoFor}.
	 * @param ctx the parse tree
	 */
	void exitInicioQuandoFor(CirnoParser.InicioQuandoForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#forFor}.
	 * @param ctx the parse tree
	 */
	void enterForFor(CirnoParser.ForForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#forFor}.
	 * @param ctx the parse tree
	 */
	void exitForFor(CirnoParser.ForForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterTipoPrimitivo(CirnoParser.TipoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitTipoPrimitivo(CirnoParser.TipoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operacaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoAritmetica(CirnoParser.OperacaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoAritmetica(CirnoParser.OperacaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operacaoAdicao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoAdicao(CirnoParser.OperacaoAdicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacaoAdicao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoAdicao(CirnoParser.OperacaoAdicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operacaoMultiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoMultiplicacao(CirnoParser.OperacaoMultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacaoMultiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoMultiplicacao(CirnoParser.OperacaoMultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operacaoRelacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoRelacao(CirnoParser.OperacaoRelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacaoRelacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoRelacao(CirnoParser.OperacaoRelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operacaoIgualdade}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoIgualdade(CirnoParser.OperacaoIgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacaoIgualdade}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoIgualdade(CirnoParser.OperacaoIgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operacaoComparacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoComparacao(CirnoParser.OperacaoComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacaoComparacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoComparacao(CirnoParser.OperacaoComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operadorLogicoBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogicoBinario(CirnoParser.OperadorLogicoBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operadorLogicoBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogicoBinario(CirnoParser.OperadorLogicoBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CirnoParser#operadorLogicoUnitario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogicoUnitario(CirnoParser.OperadorLogicoUnitarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operadorLogicoUnitario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogicoUnitario(CirnoParser.OperadorLogicoUnitarioContext ctx);
}