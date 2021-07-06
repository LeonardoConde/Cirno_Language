package Cirno.Language.Variables;

public abstract class GenericVariable<Type> {
    private final String name;
    private final String type;
    private Type value;

    GenericVariable(String type,String name, Type value){
        this.name =name;
        this.type = type;
        this.value = value;
    }

    GenericVariable(String type, Type value){
        this.name =null;
        this.type = type;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public Type getObjectValue(){
        return this.value;
    }

    public void setObjectValue(Type value){
        this.value = value;
    }

    public abstract boolean isTypeOf(Object value);
}
