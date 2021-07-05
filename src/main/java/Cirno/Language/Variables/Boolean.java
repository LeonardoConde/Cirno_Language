package Cirno.Language.Variables;

public class Boolean extends GenericVariable {
    Boolean(String name, java.lang.Boolean value){
        super(name,"Boolean",value);
    }

    public java.lang.Boolean getValue(){
        return  ((java.lang.Boolean) this.getObjectValue()).booleanValue();
    }

    public void setValue(java.lang.Boolean value){
        this.setObjectValue(value);
    }

    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof java.lang.Boolean) {
            return true;
        }
        if (value instanceof Boolean) {
            return true;
        }
        return false;
    }
}
