package com.softserve.edu05;

import java.util.Scanner;

/**
 * Create a do-while loop that prompts the user to enter two numbers and calculates their
 * sum. After displaying the result, the program should ask the user if they want to perform
 * the operation again. If the user inputs a positive response, the loop should repeat;
 * otherwise, it should terminate.
 */
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        boolean recalculate;

        do {
            recalculate = false;

            System.out.print("Input first number: ");
            firstNumber = input.nextDouble();

            System.out.print("Input second number: ");
            secondNumber = input.nextDouble();

            System.out.printf("Sum of number %.2f and %.2f = %.2f%n",
                    firstNumber, secondNumber, (firstNumber + secondNumber));
            System.out.println("Do you want to perform the operation again (yes/no)?");

            if (input.next().equalsIgnoreCase("yes")) {
                recalculate = true;
            }
        } while(recalculate);
    }
}
