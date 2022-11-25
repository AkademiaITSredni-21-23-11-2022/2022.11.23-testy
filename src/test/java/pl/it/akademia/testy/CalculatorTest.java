package pl.it.akademia.testy;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor !!");
    }

    @Test
    public void addTwoPositivesTest() {
        int a = 5;
        int b = 7;
        int expected = 12;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTwoNegativesTest() {
        int a = -5;
        int b = -3;
        int expected = -8;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTwoPositivesTest() {
        int a = 5;
        int b = 2;
        double expected = 2.9;

        double actual = calculator.divide(a, b);

        Assert.assertEquals(expected, actual, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
    }
}
