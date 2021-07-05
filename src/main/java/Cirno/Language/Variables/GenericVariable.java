package Cirno.Language.Variables;

public class GenericVariable {
    private final PrimitiveTypes type;
    private final String name;
    private Object value;

    GenericVariable(PrimitiveTypes type,String name,Object value){
        this.type = type;
        this.name = name;
        this.value =value;
    }

    GenericVariable(PrimitiveTypes type,String name){
        this.type = type;
        this.name = name;
        this.value = null;
    }

    GenericVariable(PrimitiveTypes type,Object value){
        this.type = type;
        this.name = null;
        this.value =value;
    }

    GenericVariable(PrimitiveTypes type){
        this.type = type;
        this.name = null;
        this.value = null;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    public  Object getObjectValue(){
        return this.value;
    }
}
