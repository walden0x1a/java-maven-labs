package com.example;

public class App {
    public static void main(String[] args) {

        // Validation: check enough arguments were provided
        if (args.length < 2) {
            System.out.println("Usage: App <num1> <num2>");
            System.exit(1);
        }

        // Validation: check the arguments are actually numbers
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            Calculator calc = new Calculator();

            System.out.println("Sum:     " + calc.sum(a, b));
            System.out.println("Diff:    " + calc.diff(a, b));
            System.out.println("Product: " + calc.product(a, b));
            System.out.println("Average: " + calc.average(a, b));
            System.out.println(a + " is even: " + calc.isEven(a));
            System.out.println(b + " is even: " + calc.isEven(b));

        } catch (NumberFormatException e) {
            System.out.println("Error: both arguments must be integers.");
            System.exit(1);
        }
    }
}
