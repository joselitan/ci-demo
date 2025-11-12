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
        double result = calculator.add(1.0, 2.1);
        assertEquals(3.1, result );
        double result2 = calculator.add(1.1, 90.0);
        assertEquals(91.1, result2);
    }

    @Test
    void subtract(){
        double result = calculator.subtract(10.0, 13.0);
        assertEquals(-3, result);

    }

    @Test
    void multiply(){
        Calculator calc = new Calculator();
        assertEquals(10, calc.multiply(2,5));
        assertEquals(100, calc.multiply(10, 10));
    }

    @Test
    void divide(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(4, 2));
        assertEquals(5, calc.divide(10, 2));
        assertEquals(.5, calc.divide(1, 2));
    }
}
