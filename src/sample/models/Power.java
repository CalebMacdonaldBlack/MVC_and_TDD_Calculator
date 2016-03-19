package sample.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Power extends Calculator {
    /**
     * Finds the exponential? of two numbers
     * @return The power of two numbers
     */
    @Override
    public double calculate() {
        return  Math.pow(getNum1(), getNum2());
    }
}
