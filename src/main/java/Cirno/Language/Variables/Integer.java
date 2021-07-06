package Cirno.Language.Variables;

public class Integer extends GenericVariable {
    Integer(String name, java.lang.Integer value){
        super("Inteiro",name,value);
    }

    Integer(String name){
        super("Inteiro",name);
    }

    Integer(java.lang.Integer value){
        super("Inteiro",null,value);
    }

    Integer(){
        super("Inteiro",null);
    }

    public java.lang.Integer getValue (){
        return  ((java.lang.Integer) this.getObjectValue()).intValue();
    }

    public void setValue(java.lang.Integer value){
        this.setObjectValue(value);
    }

    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof java.lang.Integer) {
            return true;
        }
        if (value instanceof Integer) {
            return true;
        }
        return false;
    }
}
