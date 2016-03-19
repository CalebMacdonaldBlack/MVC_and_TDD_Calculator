package sample.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
abstract public class Calculator {
    static double num1;
    static double num2;
    static Calculator operator;

    public abstract double calculate();

    public static void setNum1AndOperator(String number, String operator){
        num1 = Double.valueOf(number);
        setOperator(operator);
    }

    public static String setNum2AndGetResult(String number){
        try {
            num2 = Double.valueOf(number);
        }catch(NumberFormatException e){
            num2 = 0;
        }
        return getResult();
    }

    public static double getNum2() {
        return num2;
    }

    public static double getNum1() {
        return num1;
    }

    public static String getResult(){
        String result = String.valueOf(operator.calculate());
        result = removeDecimalIfNeeded(result);
        return result;
    }

    public static void setOperator(String operator){
        Calculator.operator = findOperatorFromId(operator);
    }



    public static Calculator findOperatorFromId(String id){
        System.out.println("id is: " + id);
        switch(id){
            case "add":
                return new Add();
            case "subtract":
                return new Subtract();
            case "divide":
                return new Divide();
            case "multiply":
                return new Multiply();
            case "modulus":
                return new Modulus();
            case "power":
                return new Power();
            default:
                throw new NullPointerException();
        }
    }

    public static String extractNumberFromIdAndAddToString(String id, String label) {
        String[] idSplit = id.split("_");
        if(idSplit[1].equals("dot"))
            return label + ".";
        else
            return label + idSplit[1];
    }

    public static String removeDecimalIfNeeded(String result){
        String[] resultSplit = result.split("\\.");
        if(resultSplit[1].equals("0"))
            return resultSplit[0];
        else
            return result;
    }
}
