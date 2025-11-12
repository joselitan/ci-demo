package org.example;

public class Calculator {
    public double add(double a, double b){

        return a + b;
    }

    public double subtract(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Argument får inte vara null.");
        }
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b;
    }

    public int square(int a){
        return a * a;
    }
}
