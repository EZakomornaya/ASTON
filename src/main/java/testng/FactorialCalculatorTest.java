package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testGetFactorialForZero() {
        Assert.assertEquals(calculator.calcFactorial(0), 1);
    }

    @Test
    public void testGetFactorialForPositiveNumber() {
        Assert.assertEquals(calculator.calcFactorial(4), 24);
    }

    @Test
    public void testGetFactorialForNegativeNumber() {
        try {
            calculator.calcFactorial(-1);
            Assert.fail("Expected IllegalArgumentException for negative number");
        }
        catch (IllegalArgumentException e) { // Expected exception
        }
    }
}

