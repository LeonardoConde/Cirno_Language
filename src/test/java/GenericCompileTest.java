import java.io.File;

public class GenericCompileTest {
    private File file;
    private Boolean result = true;

    GenericCompileTest(String fileName,Boolean execute) {
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
        try{
            //TODO
        }catch (Exception e){
            error(e);
        }
        return result;
    }

    private void error(Exception e){
        result = false;
        System.out.println("ERROR:\n"+e.toString());
    }
}

