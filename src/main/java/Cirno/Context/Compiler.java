package Cirno.Context;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import Cirno.Grammar.CirnoLexer;
import Cirno.Grammar.CirnoParser;

import java.io.File;
import java.io.IOException;
public class Compiler {
    public static void main(String[] args) throws IOException{
        File file =new  File(args[0]);
        CirnoLexer lexer = new CirnoLexer(CharStreams.fromString(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CirnoParser parser = new CirnoParser(tokens);
        CirnoParser.InicioContext arvore = parser.inicio();

        CirnoContext semantico = new CirnoContext();
    }
}
