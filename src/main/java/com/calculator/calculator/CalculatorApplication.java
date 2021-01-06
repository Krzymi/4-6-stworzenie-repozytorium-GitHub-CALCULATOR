package com.calculator.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void Adding() {
        int myResult;
        myResult = x + y;
        System.out.println("Result of adding " + x + " to " + y + " is: " +myResult);
    }

    public void Substracting() {
        int myResult;
        myResult = x - y;
        System.out.println("Result of substracting " + y + " from " + x + " is: " +myResult);
    }
}

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator1 = new Calculator(2, 5);
        calculator1.Adding();

        Calculator calculator2 = new Calculator(7, 5);
        calculator2.Substracting();
    }
}
