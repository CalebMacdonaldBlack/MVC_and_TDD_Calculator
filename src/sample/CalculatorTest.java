package sample;

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
        Calculator.setNum1AndOperator("12","add");
        Calculator.setNum2AndGetResult("14");
        Calculator add = new Add();
        assertEquals(26, add.calculate(), 0.001);
    }

    @org.junit.Test
    public void testAdditionCalculationAgain(){
        Calculator.setNum1AndOperator("88","add");
        Calculator.setNum2AndGetResult("19");
        Calculator add = new Add();
        assertEquals(107, add.calculate(), 0.001);
    }

    @org.junit.Test
    public void testSubtractionCalculation(){
        Calculator.setNum1AndOperator("20","add");
        Calculator.setNum2AndGetResult("14");
        Calculator subtract = new Subtract();
        assertEquals(6, subtract.calculate(), 0.001);
    }

    @org.junit.Test
    public void testSubtractionCalculationAgain(){
        Calculator.setNum1AndOperator("15","add");
        Calculator.setNum2AndGetResult("30");
        Calculator subtract = new Subtract();
        assertEquals(-15, subtract.calculate(), 0.001);
    }

    @org.junit.Test
    public void testDivideCalculation(){
        Calculator.setNum1AndOperator("21","add");
        Calculator.setNum2AndGetResult("3");
        Calculator divide = new Divide();
        assertEquals(7, divide.calculate(), 0.001);
    }

    @org.junit.Test
    public void testDivideCalculationAgain(){
        Calculator.setNum1AndOperator("5","add");
        Calculator.setNum2AndGetResult("2");
        Calculator divide = new Divide();
        assertEquals(2.5, divide.calculate(), 0.001);
    }

    @org.junit.Test
    public void testMultiplyCalculation(){
        Calculator.setNum1AndOperator("7","add");
        Calculator.setNum2AndGetResult("3");
        Calculator multiply = new Multiply();
        assertEquals(21, multiply.calculate(), 0.001);
    }

    @org.junit.Test
    public void testMultiplyCalculationAgain(){
        Calculator.setNum1AndOperator("2","add");
        Calculator.setNum2AndGetResult("20");
        Calculator multiply = new Multiply();
        assertEquals(40, multiply.calculate(), 0.001);
    }

    @org.junit.Test
    public void testModulusCalculation(){
        Calculator.setNum1AndOperator("21","add");
        Calculator.setNum2AndGetResult("6");
        Calculator modulus = new Modulus();
        assertEquals(3, modulus.calculate(), 0.001);
    }

    @org.junit.Test
    public void testModulusCalculationAgain(){
        Calculator.setNum1AndOperator("10","add");
        Calculator.setNum2AndGetResult("2");
        Calculator modulus = new Modulus();
        assertEquals(0, modulus.calculate(), 0.001);
    }

    @org.junit.Test
    public void testPowerCalculation(){
        Calculator.setNum1AndOperator("3","add");
        Calculator.setNum2AndGetResult("2");
        Calculator power = new Power();
        assertEquals(9, power.calculate(), 0.001);
    }

    @org.junit.Test
    public void testPowerCalculationAgain(){
        Calculator.setNum1AndOperator("5","add");
        Calculator.setNum2AndGetResult("3");
        Calculator power = new Power();
        assertEquals(125, power.calculate(), 0.001);
    }

    @org.junit.Test
    public void testConcatNumber(){
        assertEquals(Calculator.extractNumberFromIdAndAddToString("num_1","12"), ("121"));
    }

    @org.junit.Test
    public void testConcatNumberAgain(){
        assertEquals(Calculator.extractNumberFromIdAndAddToString("num_6","7"), ("76"));
    }

    @org.junit.Test
    public void testConcatNumberWithDecimal(){
        assertEquals(Calculator.extractNumberFromIdAndAddToString("num_dot","7"), ("7."));
    }

    @org.junit.Test
    public void testGetResult(){
        Calculator.setNum1AndOperator("8", "add");
        assertEquals(Calculator.setNum2AndGetResult("5"),"13");
    }

    @org.junit.Test
    public void testGetResultAgain(){
        Calculator.setNum1AndOperator("8", "divide");
        assertEquals(Calculator.setNum2AndGetResult("2"),"4");
    }
}