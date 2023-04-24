package com.softserve.edu03.practicalTask;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        double firstNumber = Calculate.getNumber("Enter the first number: ");
        double secondNumber = Calculate.getNumber("Enter the second number: ");

        Calculate calculate = new Calculate();
        System.out.printf("The sum of %.2f and %.2f is %.2f\n", firstNumber, secondNumber, calculate.getTotal(firstNumber, secondNumber));
        System.out.printf("The average of %.2f and %.2f is %.2f\n", firstNumber, secondNumber, calculate.getAverage(firstNumber, secondNumber));
    }

    private static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private double getTotal(double $numOne, double $numTwo) {
        return $numOne + $numTwo;
    }

    private double getAverage(double $numOne, double $numTwo) {
        return ($numOne + $numTwo) / 2;
    }
}
