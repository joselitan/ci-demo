package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    private static final Logger logger = Logger.getLogger(CalculatorTest.class.getName());

    private final int a = 10;
    private final int b = 2;
    //private final int number = 4

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void DivideWithLogging(){

        logger.info("Dividerar " + a + " med " + b);
        if(b==0){
            logger.severe( "Divided by zero!!");
            throw new IllegalArgumentException("Divided by zero");
        }
        int result = calculator.divide(a, b);
        assertEquals(5, result);
    }

    @Test
    void add(){
        logger.info("Adderar " + a + " med " + b);
        int result = calculator.add(a, b);
        assertEquals(12, result );
    }

    @Test
    void subtract(){
        logger.info("Substraherar " + a + " med " + b);
        int result = calculator.subtract(a, b);
        assertEquals(8, result);

    }

    @Test
    void multiply(){
        logger.info("Multiplicerar " + a + " med " + b);
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }

    @Test
    void divide(){
        logger.info("Dividerar " + a + " med " + b);
        int result = calculator.divide(a, b);
        assertEquals(5, result);

    }

    @Test
    void square(){

        int result = calculator.square(a);
        int result2 = calculator.square(b);
        assertEquals(100, result);
        assertEquals(4, result2);
        //test
    }
}
