// Generated from Cirno.g4 by ANTLR 4.9.2
package Cirno.Grammar;
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
	 * Visit a parse tree produced by {@link CirnoParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(CirnoParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#operacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacoes(CirnoParser.OperacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#parametroOperacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroOperacao(CirnoParser.ParametroOperacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(CirnoParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(CirnoParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracaoSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoSe(CirnoParser.DeclaracaoSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#inicioSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicioSe(CirnoParser.InicioSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#seEntao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeEntao(CirnoParser.SeEntaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracaoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoPara(CirnoParser.DeclaracaoParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#condicionalPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalPara(CirnoParser.CondicionalParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#condicionalInicioPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalInicioPara(CirnoParser.CondicionalInicioParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#condicionalIncrementoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalIncrementoPara(CirnoParser.CondicionalIncrementoParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoFor(CirnoParser.AtribuicaoForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#incrementoFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementoFor(CirnoParser.IncrementoForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracaoRepitaEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoRepitaEnquanto(CirnoParser.DeclaracaoRepitaEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracaoEnquantoExecute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoEnquantoExecute(CirnoParser.DeclaracaoEnquantoExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#declaracaoQuandoFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoQuandoFor(CirnoParser.DeclaracaoQuandoForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#inicioQuandoFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicioQuandoFor(CirnoParser.InicioQuandoForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CirnoParser#forFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForFor(CirnoParser.ForForContext ctx);
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
}