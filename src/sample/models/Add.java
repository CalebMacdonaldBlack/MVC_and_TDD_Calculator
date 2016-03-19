package sample.models;

import sample.models.Calculator;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Add extends Calculator {

    /**
     * Adds two numbers together
     * @return Sum of the two numbers
     */
    @Override
    public double calculate() {
        return getNum1() + getNum2();
    }
}
