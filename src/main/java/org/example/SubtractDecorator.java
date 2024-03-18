package org.example;

public class SubtractDecorator extends CalculatorDecorator {
    public SubtractDecorator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public double firstNumber() {
        return calculator.firstNumber();
    }

    @Override
    public double secondNumber() {
        return calculator.secondNumber();
    }


    @Override
    public double output() {
        return firstNumber - secondNumber;
    }

    @Override
    public String logg() {
        String message = firstNumber + " - " + secondNumber + " = " + output();
        Logger.log(message);
        return message;
    }
}