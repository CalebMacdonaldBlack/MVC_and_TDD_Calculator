package sample.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Divide extends Calculator {
    @Override
    public double calculate() {
        return Double.valueOf(getNum1()) / getNum2();
    }
}
