package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTwoTest {

    @Test
    void testAdd(){
        CalculatorTwo calc = new CalculatorTwo();
        assertEquals(5, calc.calculate("add", 2, 3));
    }

    @Test
    void testSubstract(){
        CalculatorTwo calc = new CalculatorTwo();
        assertEquals(5, calc.calculate("subtract", 10, 5));
    }

    @Test
    void testMultiply(){
        CalculatorTwo calc = new CalculatorTwo();
        assertEquals(10, calc.calculate("multiply", 5, 2));
    }

    @Test
    void testDivision(){
        CalculatorTwo calc = new CalculatorTwo();
        assertEquals(5, calc.calculate("divide", 10, 2));
    }
}
