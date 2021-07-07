import java.io.File;
import java.util.Scanner;

import Cirno.Context.CirnoContext;
import Cirno.Context.Compiler;
import Cirno.Grammar.CirnoLexer;
import Cirno.Grammar.CirnoParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class GenericCompileTest {
    private File file;
    private Boolean ignore;
    private Boolean result = true;

    GenericCompileTest(String fileName,Boolean execute) {
        ignore = !execute;
        try{
            if(execute){
                file = new File("src/test/resources/"+fileName+".cirno");
                if(!file.exists()){
                    throw new NullPointerException("File not found!");
                }
            }
        }catch (Exception e){
            error(e);
        }
    }

    public boolean compile(){
        if(!ignore) {
            try {
                String code = "";
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    code = code + scan.nextLine();
                }
                System.out.println(code);
                CirnoLexer lexer = new CirnoLexer(CharStreams.fromString(code));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CirnoParser parser = new CirnoParser(tokens);
                CirnoParser.InicioContext arvore = parser.inicio();
                CirnoContext semantico = new CirnoContext();
                Object saida = semantico.visit(arvore);
            } catch (Exception e) {
                error(e);
            }
        }
        return result;
    }

    private void error(Exception e){
        result = false;
        System.out.println("ERROR:\n"+e.toString());
    }
}

