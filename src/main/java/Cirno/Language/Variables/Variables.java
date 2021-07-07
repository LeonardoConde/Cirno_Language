package Cirno.Language.Variables;

import static Cirno.Language.Variables.PrimitiveTypes.*;

public class Variables {
    private PrimitiveTypes type;
    private String name;
    private Object value;

    public Variables(String type, String name, Object value){
        this.type = setType(type);
        this.name = name;
        setValue(value);
        this.value= value;
    }

    Variables(String type,Object value){
        this.type = setType(type);
        setValue(value);
    }

    Variables(String type,String name){
        this.type = setType(type);
        this.name = name;
    }

    Variables(String type){
        this.type = setType(type);
    }

    public void setValue(Object value){
        if(this.type== BOOLEAN){
            this.value = (boolean)value;
        }else if(this.type== CHAR){
            this.value = (char)value;
        }else if(this.type== INTEGER){
            this.value = (int)value;
        }else if(this.type== INTEGER_POSITIVE){
            integerPositiveRule(value);
        }else if(this.type== INTEGER_NEGATIVE){
            integerNegativeRule(value);
        }if(this.type== RATIONAL){
            this.value = (double)value;
        }else if(this.type== RATIONAL_POSITIVE){
            rationalPositiveRule(value);
        }else if(this.type== RATIONAL_NEGATIVE){
            rationalNegativeRule(value);
        }else if(this.type== STRING){
            this.value = (String)value;
        }else this.value= value;
    }


    private PrimitiveTypes setType(String type) {
        switch(type) {
            case "booleano":
                 return BOOLEAN;
            case "letra":
                return CHAR;
            case "texto":
                return STRING;
            case "inteiro":
                return INTEGER;
            case "inteiro+":
                return INTEGER_POSITIVE;
            case "inteiro-":
                return INTEGER_NEGATIVE;
            case "racional":
                return RATIONAL;
            case "racional+":
                return RATIONAL_POSITIVE;
            case "racional-":
                return RATIONAL_NEGATIVE;
            default:
                return null;
        }
    }
    
    public String getType(){
        switch(this.type) {
            case BOOLEAN:
                return "booleano";
                case CHAR:
                    return "letra";
                case STRING:
                    return "texto";
                case INTEGER:
                    return "inteiro";
                case INTEGER_POSITIVE:
                    return "inteio-";
                case INTEGER_NEGATIVE:
                    return "inteio-";
                case RATIONAL:
                    return "racional";
                case RATIONAL_POSITIVE:
                    return "racional+";
                case RATIONAL_NEGATIVE:
                    return "racional-";
            default:
                return "null";
        }
    }

    private void integerPositiveRule(Object value){
        this.value = ((int) value < 0) ?  0 : (int) this.value;
    }

    private void integerNegativeRule(Object value){
        this.value = ((int) value > 0) ?  0 : (int) this.value;
    }

    private void rationalPositiveRule(Object value){
        this.value = ((double) value < 0) ?  0 : (double) this.value;
    }

    private void rationalNegativeRule(Object value){
        this.value = ((double) value > 0) ?  0 : (double) this.value;
    }

    public int getValueInt() {
        return (int)value;
    }

    public Double getValueDouble() {
        return (Double)value;
    }

    public boolean getValueBoolean() {
        return (boolean)value;
    }

    public String getValueString() {
        return (String)value;
    }
    public char getValueChar() {
        return (char)value;
    }

}
