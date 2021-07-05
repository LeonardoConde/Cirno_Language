import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void helloWorldTest(){
        GenericCompileTest test = new GenericCompileTest("HelloWorld", false);
        assert(test.compile());
    }

}
