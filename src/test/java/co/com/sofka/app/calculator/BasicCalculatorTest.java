package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing rest: 2-2=0")
    public void rest() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 2L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.rest(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing rest: 2*2=4")
    public void mult() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 2L;
        Long expectedValue = 4L;

        // Act
        Long result = basicCalculator.multi(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing rest: 2/2=1")
    public void divi() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 2L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

}
