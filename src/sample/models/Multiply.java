package sample.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Multiply extends Calculator {
    @Override
    public double calculate() {
        return getNum1() * getNum2();
    }
}
