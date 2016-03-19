package sample.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Divide extends Calculator {

    /**
     * Divides two numebers
     * @return The division of the two numbers
     */
    @Override
    public double calculate() {
        return Double.valueOf(getNum1()) / getNum2();
    }
}
