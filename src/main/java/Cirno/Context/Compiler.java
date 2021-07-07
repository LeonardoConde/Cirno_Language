package Cirno.Context;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import Cirno.Grammar.CirnoLexer;
import Cirno.Grammar.CirnoParser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Compiler {
    public static void main(String args[]) throws IOException{
        String code = "";
        File file = new  File("src/test/resources/HelloWorld.cirno");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            code = code + scan.nextLine();
        }
        System.out.println(code);
        CirnoLexer lexer = new CirnoLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CirnoParser parser = new CirnoParser(tokens);
        CirnoParser.InicioContext arvore = parser.inicio();
        CirnoContext semantico = new CirnoContext();
        Object saida = semantico.visit(arvore);
        //System.out.println("A variável que criamos é : "+semantico.vars.get("x").getValueInt());
    }

}
