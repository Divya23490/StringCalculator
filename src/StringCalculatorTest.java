// StringCalculatorTest.java

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testAdd_EmptyString_ReturnsZero() {
        // Arrange
        StringCalculator sc = new StringCalculator();

        // Act
        int result = sc.add("");

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testAdd_SingleNumber_ReturnsNumber() {
        // Arrange
        StringCalculator sc = new StringCalculator();

        // Act
        int result = sc.add("1");

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testAdd_TwoNumbersSeparatedByComma_ReturnsSum() {
        // Arrange
        StringCalculator sc = new StringCalculator();

        // Act
        int result = sc.add("1,2");

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void testAdd_UnknownAmountOfNumbers_ReturnsSum() {
        // Arrange
        StringCalculator sc = new StringCalculator();

        // Act
        int result = sc.add("1,2,3,4,5");

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testAdd_NewLinesBetweenNumbers_ReturnsSum() {
        // Arrange
        StringCalculator sc = new StringCalculator();

        // Act
        int result = sc.add("1\n2,3");

        // Assert
        assertEquals(6, result);
    }
}
