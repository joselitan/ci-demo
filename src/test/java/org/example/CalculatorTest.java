package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void add(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3));
        assertEquals(2.5, calc.add(1.5, 1));
    }

    @Test
    void subtract(){
        Calculator calc = new Calculator();
        assertEquals(-3, calc.subtract(2,5));
        assertEquals(-3, calc.subtract(3,6));
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
