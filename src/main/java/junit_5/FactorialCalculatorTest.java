package junit_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName ("Вычисление факториала числа")
public class FactorialCalculatorTest {
    @Test
    @DisplayName ("Вычисление факториала 0")
    void testCalculateFactorialForZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    @DisplayName ("Вычисление факториала положительного числа")
    void testCalculateFactorialForPositiveNumber() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(2, FactorialCalculator.calculateFactorial(2));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }

    @Test
    @DisplayName ("Вычисление факториала отрицательного числа")
    void testCalculateFactorialForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
