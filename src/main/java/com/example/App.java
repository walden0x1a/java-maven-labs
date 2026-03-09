package com.example;

public class App {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: App <num1> <num2> ... <numN>");
            System.exit(1);
        }

        try {
            int[] numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            ArrayStats stats = new ArrayStats();

            System.out.println("Max:  " + stats.max(numbers));
            System.out.println("Min:  " + stats.min(numbers));
            System.out.println("Mean: " + stats.mean(numbers));

        } catch (NumberFormatException e) {
            System.out.println("Error: all arguments must be integers.");
            System.exit(1);
        }
    }
}
