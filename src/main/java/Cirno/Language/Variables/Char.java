package Cirno.Language.Variables;

public class Char extends GenericVariable implements Variables {

    Char(){
        super(PrimitiveTypes.CHAR);
    }

    Char(String name){
        super(PrimitiveTypes.CHAR,name);
    }

    Char(Char value){
        super(PrimitiveTypes.CHAR,value);
    }

    Char(String name,Char value){
        super(PrimitiveTypes.CHAR,name,value);
    }

    public void setValue(Char value){
        this.setValue(value);
    }


    public java.lang.Character getValue(){
        return ((Character) this.getObjectValue()).charValue();
    }
}
