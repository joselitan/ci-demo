package org.example;

public class Calculator {
    public int add(int a, int b){

        return a + b;
    }

    public int subtract(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Argument får inte vara null.");
        }
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(Integer a, Integer b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b;
    }

    public int square(int a){
        return a * a;
    }
}
