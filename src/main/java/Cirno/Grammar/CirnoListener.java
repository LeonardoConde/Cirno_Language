// Generated from Cirno.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link CirnoParser#operacaoMatematicaInteiros}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoMatematicaInteiros(CirnoParser.OperacaoMatematicaInteirosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CirnoParser#operacaoMatematicaInteiros}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoMatematicaInteiros(CirnoParser.OperacaoMatematicaInteirosContext ctx);
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
}