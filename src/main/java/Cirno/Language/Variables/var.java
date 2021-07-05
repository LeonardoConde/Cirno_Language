package Cirno.Language.Variables;

public abstract class var<Type> {
    private final String name;
    private Type value;

    var(String name, Type value){
        this.name =name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public Type getValue(){
        return this.value;
    }

    public void setValue(Type value){
        this.value = value;
    }

    public abstract boolean isTypeOf(Object value);
}
