package com.softserve.edu12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create div() method, which calculates the dividing of two double type numbers. In main()
 * method input 2 double numbers and call this method. Catch all exceptions.
 */
public class Dividing {
    public static void main(String[] args) {
        try {
            double num1 = input("Enter first number:");
            double num2 = input("Enter second number:");
            System.out.printf("Dividing result: %.2f", div(num1, num2));
        } catch (ArithmeticException e) {
            System.out.printf("Error: %s", e.getMessage());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input. Please enter number.");
        }
    }

    private static double div(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return num1 / num2;
    }

    private static double input(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);

        while (!input.hasNextDouble()) {
            System.out.println("Allowed only double numbers, repeat please:");
            input.next();
        }

        return input.nextDouble();
    }
}
