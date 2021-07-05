package Cirno.Grammar;
// Generated from Cirno.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CirnoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CirnoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CirnoParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(CirnoParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(CirnoParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(CirnoParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracaoComAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoComAtribuicao(CirnoParser.DeclaracaoComAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracaoDeVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoDeVariavel(CirnoParser.DeclaracaoDeVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#blocoDeComando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeComando(CirnoParser.BlocoDeComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CirnoParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#funcoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncoes(CirnoParser.FuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#funcaoLer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoLer(CirnoParser.FuncaoLerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#funcaoEscrever}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoEscrever(CirnoParser.FuncaoEscreverContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacoes(CirnoParser.OperacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacaoMatematicaInteiros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoMatematicaInteiros(CirnoParser.OperacaoMatematicaInteirosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operadorLogicoBinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogicoBinario(CirnoParser.OperadorLogicoBinarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operadorLogicoUnitario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogicoUnitario(CirnoParser.OperadorLogicoUnitarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoPrimitivo(CirnoParser.TipoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoAritmetica(CirnoParser.OperacaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacaoAdicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoAdicao(CirnoParser.OperacaoAdicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacaoMultiplicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoMultiplicacao(CirnoParser.OperacaoMultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacaoRelacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoRelacao(CirnoParser.OperacaoRelacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacaoIgualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoIgualdade(CirnoParser.OperacaoIgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacaoComparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoComparacao(CirnoParser.OperacaoComparacaoContext ctx);
}