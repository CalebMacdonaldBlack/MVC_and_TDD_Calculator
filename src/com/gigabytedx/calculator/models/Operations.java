package com.gigabytedx.calculator.models;

/**
 * Created by calebmacdonaldblack on 20/03/2016.
 */
public enum Operations {
    ADD(new Add()),
    SUBTRACT(new Subtract()),
    MULTIPLY(new Multiply()),
    DIVIDE(new Divide()),
    MODULUS(new Modulus()),
    POWER(new Power());


    protected final Calculator operation;

    Operations(Calculator operation) {
        this.operation = operation;
    }

    public Calculator getOperation(){
        return operation;
    }
}
