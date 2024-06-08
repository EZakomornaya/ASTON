package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialForZero() {
        Assert.assertEquals(calculator.factorial(0), 1);
    }

    @Test
    public void testFactorialForPositiveNumber() {
        Assert.assertEquals(calculator.factorial(4), 24);
    }

    @Test
    public void testFactorialForNegativeNumber() {
        try {
            calculator.factorial(-1);
            Assert.fail("Expected IllegalArgumentException for negative number");
        }
        catch (IllegalArgumentException e) { // Expected exception
        }
    }
}

