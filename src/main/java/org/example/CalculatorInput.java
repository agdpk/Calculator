package org.example;

import java.util.Scanner;

public class CalculatorInput implements Calculator {

    @Override
    public String logg() {
        return "";
    }

    @Override
    public double firstNumber() {
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    @Override
    public double secondNumber() {
        System.out.println("Enter second number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    @Override
    public double output() {
        return 0;
    }
}