package Cirno.Context;
import Cirno.Grammar.CirnoBaseVisitor;
import Cirno.Grammar.CirnoParser;
import Cirno.Language.Variables.Variables;

import java.util.HashMap;

public class CirnoContext extends CirnoBaseVisitor {
    HashMap<String, Variables> id = new HashMap<String,Variables>();

    @Override
    public Object visitInicio(CirnoParser.InicioContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaracao(CirnoParser.DeclaracaoContext ctx) {

        return super.visitDeclaracao(ctx);
    }

    @Override
    public Object visitAtribuicao(CirnoParser.AtribuicaoContext ctx) {
        return super.visitAtribuicao(ctx);
    }

    @Override
    public Object visitDeclaracaoComAtribuicao(CirnoParser.DeclaracaoComAtribuicaoContext ctx){
        if(ctx.ID()!=null){

        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaracaoDeVariavel(CirnoParser.DeclaracaoDeVariavelContext ctx) {
        return super.visitDeclaracaoDeVariavel(ctx);
    }

    @Override
    public Object visitBlocoDeComando(CirnoParser.BlocoDeComandoContext ctx) {
        return super.visitBlocoDeComando(ctx);
    }

    @Override
    public Object visitComando(CirnoParser.ComandoContext ctx) {
        return super.visitComando(ctx);
    }

    @Override
    public Object visitFuncoes(CirnoParser.FuncoesContext ctx) {
        return super.visitFuncoes(ctx);
    }

    @Override
    public Object visitFuncaoLer(CirnoParser.FuncaoLerContext ctx) {
        return super.visitFuncaoLer(ctx);
    }

    @Override
    public Object visitFuncaoEscrever(CirnoParser.FuncaoEscreverContext ctx) {
        return super.visitFuncaoEscrever(ctx);
    }

    @Override
    public Object visitOperacoes(CirnoParser.OperacoesContext ctx) {
        return super.visitOperacoes(ctx);
    }

    @Override
    public Object visitOperacaoMatematicaInteiros(CirnoParser.OperacaoMatematicaInteirosContext ctx) {
        return super.visitOperacaoMatematicaInteiros(ctx);
    }

    @Override
    public Object visitOperadorLogicoBinario(CirnoParser.OperadorLogicoBinarioContext ctx) {
        return super.visitOperadorLogicoBinario(ctx);
    }

    @Override
    public Object visitOperadorLogicoUnitario(CirnoParser.OperadorLogicoUnitarioContext ctx) {
        return super.visitOperadorLogicoUnitario(ctx);
    }

    @Override
    public Object visitTipoPrimitivo(CirnoParser.TipoPrimitivoContext ctx) {
        return super.visitTipoPrimitivo(ctx);
    }

    @Override
    public Object visitOperacaoAritmetica(CirnoParser.OperacaoAritmeticaContext ctx) {
        return super.visitOperacaoAritmetica(ctx);
    }

    @Override
    public Object visitOperacaoAdicao(CirnoParser.OperacaoAdicaoContext ctx) {
        return super.visitOperacaoAdicao(ctx);
    }

    @Override
    public Object visitOperacaoMultiplicacao(CirnoParser.OperacaoMultiplicacaoContext ctx) {
        return super.visitOperacaoMultiplicacao(ctx);
    }

    @Override
    public Object visitOperacaoRelacao(CirnoParser.OperacaoRelacaoContext ctx) {
        return super.visitOperacaoRelacao(ctx);
    }

    @Override
    public Object visitOperacaoIgualdade(CirnoParser.OperacaoIgualdadeContext ctx) {
        return super.visitOperacaoIgualdade(ctx);
    }

    @Override
    public Object visitOperacaoComparacao(CirnoParser.OperacaoComparacaoContext ctx) {
        return super.visitOperacaoComparacao(ctx);
    }
}
