package org.example;

public abstract class CalculatorDecorator implements Calculator {
    protected Calculator calculator;
    protected double firstNumber;
    protected double secondNumber;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
        this.firstNumber = calculator.firstNumber();
        this.secondNumber = calculator.secondNumber();
    }

    @Override
    public double firstNumber() {
        return firstNumber;
    }

    @Override
    public double secondNumber() {
        return secondNumber;
    }

    @Override
    public double output() {
        return 0;
    }
}