package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTwoTestRefacatored {

    @Test
    void testAdd(){
        //CalculatorTwo calc = new CalculatorTwo();
        CalculatorTwoRefactored calc = new CalculatorTwoRefactored();
        assertEquals(5, calc.add( 2, 3));
    }

    @Test
    void testSubstract(){
        //CalculatorTwo calc = new CalculatorTwo();
        CalculatorTwoRefactored calc = new CalculatorTwoRefactored();
        assertEquals(5, calc.subtract( 10, 5));
    }

    @Test
    void testMultiply(){
        //CalculatorTwo calc = new CalculatorTwo();
        CalculatorTwoRefactored calc = new CalculatorTwoRefactored();
        assertEquals(10, calc.multiply( 5, 2));
    }

    @Test
    void testDivision(){
        //CalculatorTwo calc = new CalculatorTwo();
        CalculatorTwoRefactored calc = new CalculatorTwoRefactored();
        assertEquals(5, calc.divide(10, 2));
    }
}
