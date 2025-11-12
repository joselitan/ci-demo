package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void add(){
        double result = calculator.add(1.1, 2);
        double result2 = calculator.add(1.1, 90.0);
        assertEquals(3.1, result );
        assertEquals(91.1, result2);
    }

    @Test
    void subtract(){
        double result = calculator.subtract(10.0, 13.0);
        assertEquals(-3, result);

    }

    @Test
    void multiply(){
        double result = calculator.multiply(2.2, 2);
        double result2 = calculator.multiply(1.5, 2.0);
        assertEquals(4.4, result);
        assertEquals(3, result2);
    }

    @Test
    void divide(){
        double result = calculator.divide(15, 3);
        double result2 = calculator.divide(16, 4);
        assertEquals(5, result);
        assertEquals(4, result2);
    }
}
