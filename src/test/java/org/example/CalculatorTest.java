package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    private final int a = 1;
    private final int b = 2;
    //private final int number = 4

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }


    @Test
    void add(){
        double result = calculator.add(a, b);
        assertEquals(3, result );
    }

    @Test
    void subtract(){
        double result = calculator.subtract(10.0, 13.0);
        double result2 = calculator.subtract(3.0, 2.0);
        assertEquals(-3, result);
        assertEquals(1, result2);
    }

    @Test
    void divide(){
        double result = calculator.divide(15, 3);
        double result2 = calculator.divide(16, 4);
        assertEquals(5, result);
        assertEquals(4, result2);
    }

    @Test
    void square(){
        int result = calculator.square(4);
        int result2 = calculator.square(5);
        assertEquals(16, result);
        assertEquals(25, result2);
    }
}
