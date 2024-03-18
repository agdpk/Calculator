package org.example;

public class DivideDecorator extends CalculatorDecorator {
    public DivideDecorator(Calculator calculator) {
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
        return firstNumber / secondNumber;
    }

    @Override
    public String logg() {
        if (secondNumber == 0) {
            String message = firstNumber + " / " + secondNumber + " = " + "Division by 0 is not possible" + "\n";
            Logger.log(message);
            return message;
        } else {
            String message = firstNumber + " / " + secondNumber + " = " + output();
            Logger.log(message);
            return message;
        }
    }
}