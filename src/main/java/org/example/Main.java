package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorInput();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("Select an operation:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculator = new AddDecorator(calculator);
                    System.out.println(calculator.logg());
                    break;
                case 2:
                    calculator = new SubtractDecorator(calculator);
                    System.out.println(calculator.logg());
                    break;
                case 3:
                    calculator = new MultiplyDecorator(calculator);
                    System.out.println(calculator.logg());
                    break;
                case 4:
                    calculator = new DivideDecorator(calculator);
                    System.out.println(calculator.logg());
                    break;
                case 5:
                    System.out.println("Program completed.");
                    break;
                default:
                    System.out.println("Input error. Try again: ");
            }
        }
    }
}