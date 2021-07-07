package Cirno.Context;
import Cirno.Grammar.CirnoBaseVisitor;
import Cirno.Grammar.CirnoParser;
import Cirno.Language.Variables.Variables;

import java.util.HashMap;
import java.util.Map;

public class CirnoContext extends CirnoBaseVisitor {
    Map<String, Variables> vars = new HashMap<>();

    @Override
    public Object visitInicio(CirnoParser.InicioContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaracao(CirnoParser.DeclaracaoContext ctx) {
        vars.put(ctx.getChild(2).getText(), new Variables(ctx.getChild(0).getText(), ctx.getChild(2).getText(), 0));
        return super.visitDeclaracao(ctx);
    }

    @Override
    public Object visitAtribuicao(CirnoParser.AtribuicaoContext ctx) {
        //System.out.println(vars.get(ctx.getChild(0).getText()).getType());
        switch (vars.get(ctx.getChild(0).getText()).getType()){
            case "inteiro":
                vars.replace(ctx.getChild(0).getText(), new Variables(vars.get(ctx.getChild(0).getText()).getType(), ctx.getChild(0).getText(), Integer.valueOf(ctx.getChild(2).getText())));
                break;
            case "racional":
                vars.replace(ctx.getChild(0).getText(), new Variables(vars.get(ctx.getChild(0).getText()).getType(), ctx.getChild(0).getText(), Float.parseFloat(ctx.getChild(2).getText())));
                break;
            case "caractere":
                vars.replace(ctx.getChild(0).getText(), new Variables(vars.get(ctx.getChild(0).getText()).getType(), ctx.getChild(0).getText(), ctx.getChild(2).getText().charAt(0)));
                break;
            case "texto":
                vars.replace(ctx.getChild(0).getText(), new Variables(vars.get(ctx.getChild(0).getText()).getType(), ctx.getChild(0).getText(), ctx.getChild(2).getText()));
                break;
            case "booleano":
                vars.replace(ctx.getChild(0).getText(), new Variables(vars.get(ctx.getChild(0).getText()).getType(), ctx.getChild(0).getText(), Boolean.parseBoolean(ctx.getChild(2).getText())));
                break;
        }
        return super.visitAtribuicao(ctx);
    }

    @Override
    public Object visitDeclaracaoComAtribuicao(CirnoParser.DeclaracaoComAtribuicaoContext ctx){
        switch (ctx.getChild(0).getText()){
            case "inteiro":
                vars.put(ctx.getChild(2).getText(), new Variables(ctx.getChild(0).getText(), ctx.getChild(2).getText(), Integer.valueOf(ctx.getChild(4).getText())));
                break;
            case "racional":
                vars.put(ctx.getChild(2).getText(), new Variables(ctx.getChild(0).getText(), ctx.getChild(2).getText(), Float.parseFloat(ctx.getChild(4).getText())));
                break;
            case "caractere":
                vars.put(ctx.getChild(2).getText(), new Variables(ctx.getChild(0).getText(), ctx.getChild(2).getText(), ctx.getChild(4).getText().charAt(0)));
                break;
            case "texto":
                vars.put(ctx.getChild(2).getText(), new Variables(ctx.getChild(0).getText(), ctx.getChild(2).getText(), ctx.getChild(4).getText()));
                break;
            case "booleano":
                vars.put(ctx.getChild(2).getText(), new Variables(ctx.getChild(0).getText(), ctx.getChild(2).getText(), Boolean.parseBoolean(ctx.getChild(4).getText())));
                break;
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
        /*System.out.println(vars.get(ctx.parametro().getText()).getType());*/
        switch (vars.get(ctx.parametro().getText()).getType()){
            case "inteiro":
                System.out.println(vars.get(ctx.parametro().getText()).getValueInt());
                break;
            case "racional":
                System.out.println(vars.get(ctx.parametro().getText()).getValueDouble());
                break;
            case "caractere":
                System.out.println(vars.get(ctx.parametro().getText()).getValueChar());
                break;
            case "texto":
                System.out.println(vars.get(ctx.parametro().getText()).getValueString());
                break;
            case "booleano":
                System.out.println(vars.get(ctx.parametro().getText()).getValueBoolean());
                break;
        }
        return super.visitFuncaoEscrever(ctx);
    }

    @Override
    public Object visitOperacoes(CirnoParser.OperacoesContext ctx) {
        String a = ctx.getChild(0).getText();
        String b = ctx.getChild(2).getText();
        Variables valor1 = vars.get(a);
        Variables valor2 = vars.get(b);
        Object r = 0;

        //if (ctx.getChild(0).equals(NUMERO) && ctx.getChild(0).equals(NUMERO))
        switch (ctx.getChild(1).getText()) {
            case "+":
                //System.out.println(vars.get(ctx.parametro().getText()).getValueInt());
                if (valor1.getType() == "inteiro" && valor2.getType() == "inteiro") {
                    r = valor1.getValueInt() + valor2.getValueInt();
                } else r = valor1.getValueDouble() + valor2.getValueDouble();
                break;
            case "-":
                if (valor1.getType() == "inteiro" && valor2.getType() == "inteiro") {
                    r = valor1.getValueInt() - valor2.getValueInt();
                } else r = valor1.getValueInt() - valor2.getValueInt();
                break;
            case "*":
                if (valor1.getType() == "inteiro" && valor2.getType() == "inteiro") {
                    r = valor1.getValueInt() * valor2.getValueInt();
                } else r = valor1.getValueInt() * valor2.getValueInt();
                break;
            case "/":
                if (valor1.getType() == "inteiro" && valor2.getType() == "inteiro") {
                    r = valor1.getValueInt() / valor2.getValueInt();
                } else r = valor1.getValueInt() / valor2.getValueInt();
                break;
            case "%":
                if (valor1.getType() == "inteiro" && valor2.getType() == "inteiro") {
                    r = valor1.getValueInt() % valor2.getValueInt();
                } else r = valor1.getValueInt() % valor2.getValueInt();
                break;
        }
        /*if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para divisão.");
        }
        Double a = (Double) valor1.getValor();
        Double b = (Double) valor2.getValor();

        Variavel nova = new Variavel("numero", a/b);
        return super.visitFuncaoEscrever(ctx);*/
        return r;
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
