package sample.models;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class Power extends Calculator {
    @Override
    public double calculate() {
        return  Math.pow(getNum1(), getNum2());
    }
}
