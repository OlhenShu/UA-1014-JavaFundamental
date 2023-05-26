package lesson12.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid double values.");
        }
    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
