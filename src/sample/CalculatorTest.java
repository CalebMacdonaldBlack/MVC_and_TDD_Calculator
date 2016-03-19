package sample;

import org.junit.Assert;
import sample.models.*;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by calebmacdonaldblack on 3/19/16.
 */
public class CalculatorTest {

    @org.junit.Test
    public void testFindOperatorInCalculatorReturnsAddCalculator(){
        assertThat(Calculator.findOperatorFromId("add"), instanceOf(Add.class));
    }

    @org.junit.Test
    public void testFindOperatorInCalculatorReturnsSubtractCalculator(){
        assertThat(Calculator.findOperatorFromId("subtract"), instanceOf(Subtract.class));
    }

    @org.junit.Test
    public void testFindOperatorInCalculatorReturnsDivideCalculator(){
        assertThat(Calculator.findOperatorFromId("divide"), instanceOf(Divide.class));
    }

    @org.junit.Test
    public void testFindOperatorInCalculatorReturnsMultiplyCalculator(){
        assertThat(Calculator.findOperatorFromId("multiply"), instanceOf(Multiply.class));
    }

    @org.junit.Test
    public void testFindOperatorInCalculatorReturnsModulusCalculator(){
        assertThat(Calculator.findOperatorFromId("modulus"), instanceOf(Modulus.class));
    }

    @org.junit.Test
    public void testFindOperatorInCalculatorReturnsPowerCalculator(){
        assertThat(Calculator.findOperatorFromId("power"), instanceOf(Power.class));
    }

    @org.junit.Test
    public void testAdditionCalculation(){
        Calculator.setNum1("12");
        Calculator.setNum2("14");
        Calculator add = new Add();
        assertEquals(26, add.calculate(), 0.001);
    }

    @org.junit.Test
    public void testAdditionCalculationAgain(){
        Calculator.setNum1("88");
        Calculator.setNum2("19");
        Calculator add = new Add();
        assertEquals(107, add.calculate(), 0.001);
    }

    @org.junit.Test
    public void testSubtractionCalculation(){
        Calculator.setNum1("20");
        Calculator.setNum2("14");
        Calculator subtract = new Subtract();
        assertEquals(6, subtract.calculate(), 0.001);
    }

    @org.junit.Test
    public void testSubtractionCalculationAgain(){
        Calculator.setNum1("15");
        Calculator.setNum2("30");
        Calculator subtract = new Subtract();
        assertEquals(-15, subtract.calculate(), 0.001);
    }

    @org.junit.Test
    public void testDivideCalculation(){
        Calculator.setNum1("21");
        Calculator.setNum2("3");
        Calculator divide = new Divide();
        assertEquals(7, divide.calculate(), 0.001);
    }

    @org.junit.Test
    public void testDivideCalculationAgain(){
        Calculator.setNum1("5");
        Calculator.setNum2("2");
        Calculator divide = new Divide();
        assertEquals(2.5, divide.calculate(), 0.001);
    }

    @org.junit.Test
    public void testMultiplyCalculation(){
        Calculator.setNum1("7");
        Calculator.setNum2("3");
        Calculator multiply = new Multiply();
        assertEquals(21, multiply.calculate(), 0.001);
    }

    @org.junit.Test
    public void testMultiplyCalculationAgain(){
        Calculator.setNum1("2");
        Calculator.setNum2("20");
        Calculator multiply = new Multiply();
        assertEquals(40, multiply.calculate(), 0.001);
    }

    @org.junit.Test
    public void testModulusCalculation(){
        Calculator.setNum1("21");
        Calculator.setNum2("6");
        Calculator modulus = new Modulus();
        assertEquals(3, modulus.calculate(), 0.001);
    }

    @org.junit.Test
    public void testModulusCalculationAgain(){
        Calculator.setNum1("10");
        Calculator.setNum2("2");
        Calculator modulus = new Modulus();
        assertEquals(0, modulus.calculate(), 0.001);
    }

    @org.junit.Test
    public void testPowerCalculation(){
        Calculator.setNum1("3");
        Calculator.setNum2("2");
        Calculator power = new Power();
        assertEquals(9, power.calculate(), 0.001);
    }

    @org.junit.Test
    public void testPowerCalculationAgain(){
        Calculator.setNum1("5");
        Calculator.setNum2("3");
        Calculator power = new Power();
        assertEquals(125, power.calculate(), 0.001);
    }

    @org.junit.Test
    public void testConcatNumber(){
        assertEquals(Calculator.concatNumber("num_1","12"), ("121"));
    }

    @org.junit.Test
    public void testConcatNumberAgain(){
        assertEquals(Calculator.concatNumber("num_6","7"), ("76"));
    }

    @org.junit.Test
    public void testConcatNumberWithDecimal(){
        assertEquals(Calculator.concatNumber("num_dot","7"), ("7."));
    }

    @org.junit.Test
    public void testRemoveDecimalIfWhenNeeded(){
        assertEquals(Calculator.removeDecimalIfNeeded("12.0"), ("12"));
    }

    @org.junit.Test
    public void testRemoveDecimalIfWhenNotNeeded(){
        assertEquals(Calculator.removeDecimalIfNeeded("6.75"), ("6.75"));
    }

}