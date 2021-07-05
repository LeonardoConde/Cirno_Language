package Cirno.Language.Variables;

public class Boolean extends GenericVariable implements Variables {

    Boolean(){
        super(PrimitiveTypes.BOOLEAN);
    }

    Boolean(String name){
        super(PrimitiveTypes.BOOLEAN,name);
    }

    Boolean(Boolean value){
        super(PrimitiveTypes.BOOLEAN,value);
    }

    Boolean(String name,Boolean value){
        super(PrimitiveTypes.BOOLEAN,name,value);
    }

    public void setValue(boolean value){
        this.setValue(value);
    }


    public boolean getValue(){
        return ((Boolean) this.getObjectValue()).getValue();
    }
}
