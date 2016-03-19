package sample.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
abstract public class Calculator {
    static double num1;
    static double num2;
    static Calculator operator;

    /**
     * This function gets the two numbers from global scope and calculates them
     * @return returns the 2 numbers calculated together through the calculate operation
     */
    public abstract double calculate();

    /**
     * Sets the value of the first number and sets the operator
     * @param number The first value to calculate
     * @param operator The method in which they will be calculated
     */
    public static void setNum1AndOperator(String number, String operator){
        num1 = Double.valueOf(number);
        setOperator(operator);
    }

    /**
     * Sets the second number and returns result
     * @param number The second number to be calculated
     * @return The result of the calculation as a string
     */
    public static String setNum2AndGetResult(String number){
        try {
            num2 = Double.valueOf(number);
        }catch(NumberFormatException e){
            num2 = 0;
        }
        return getResult();
    }

    /**
     *
     * @return Second number
     */
    public static double getNum2() {
        return num2;
    }

    /**
     *
     * @return First number
     */
    public static double getNum1() {
        return num1;
    }

    /**
     * Calculates and returns the value as a string and removes decimal if it is a whole number
     * @return calculated value as a string
     */
    private static String getResult(){
        String result = String.valueOf(operator.calculate());
        result = removeDecimalIfNeeded(result);
        return result;
    }

    /**
     * Sets the operator which determines how the two numbers will be calulated
     * @param operator String which defines the operation to be performed
     */
    private static void setOperator(String operator){
        Calculator.operator = findOperatorFromId(operator);
    }


    /**
     * gets the operator from the id
     * @param id id for the view compnent
     * @return A new instance of Calculator which calculates the specified operation
     */
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

    /**
     * Extracts the number from the id adds it to the label string. This also handles adds decimals to the label text
     * @param id Id for the view component pressed
     * @param label The current text of the views label
     * @return The new label text with the new number or decimal concatenated
     */
    public static String extractNumberFromIdAndAddToString(String id, String label) {
        String[] idSplit = id.split("_");
        if(idSplit[1].equals("dot"))
            return label + ".";
        else
            return label + idSplit[1];
    }

    /**
     * Determines if the result is a whole number and removes the decimal if it is
     * @param result The double that was calculated as a string
     * @return The new result with decimal removed if needed
     */
    private static String removeDecimalIfNeeded(String result){
        String[] resultSplit = result.split("\\.");
        if(resultSplit[1].equals("0"))
            return resultSplit[0];
        else
            return result;
    }
}
