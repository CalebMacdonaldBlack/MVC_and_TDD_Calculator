package com.gigabytedx.calculator.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Modulus extends Calculator {

    /**
     * Finds the modulus of two numbers
     * @return Modulus of two numbers
     */
    @Override
    public double calculate() {
        return getNum1() % getNum2();
    }
}
