package com.softserve.edu05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a program (in different java documents) that prompts the user to enter:
 * • 10 integers numbers and calculates the sum of the first five elements if they are
 * positive, or the product of the last five elements if they are not and output the result.
 */
public class IntegersCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        boolean firstPositive = true;
        int sum = 0;
        int product = 1;

        try {

            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("Enter integer number #%d: ", i + 1);
                while (!input.hasNextInt()) {
                    System.out.println("Please enter an integer.");
                    input.next();
                }
                numbers[i] = input.nextInt();

                if (i < 5 && numbers[i] <= 0) {
                    firstPositive = false;
                    continue;
                } else {
                    sum += numbers[i];
                }
                if (i >= 5 && !firstPositive) {
                    product *= numbers[i];
                }
            }

            if (firstPositive) {
                System.out.printf("Sum of the first five positive numbers is: %d", sum);
            } else {
                System.out.printf("Product of the last five non-positive numbers is: %d", product);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error. Please check the number of inputs.");
        } finally {
            input.close();
        }
    }
}
