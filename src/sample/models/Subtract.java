package sample.models;

import sample.models.Calculator;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Subtract extends Calculator {

    /**
     * Subtracts two numbers
     * @return The result of two subtracted numbers
     */
    @Override
    public double calculate() {
        return getNum1() - getNum2();
    }
}
