package com.softserve.edu05;

import java.util.Scanner;

/**
 * Create a program (in different java documents) that prompts the user to enter:
 * • 5 integer numbers and find:
 * o position of second positive number;
 * o minimum value and its position in the array.
 * o calculate the product of all entered even numbers (exclude 0 from even if entered by
 * user).
 */
public class FindIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter %d integer numbers: %n", i + 1);
            numbers[i] = input.nextInt();
        }

        input.close();

        int firstPositiveIndex = 0;
        int secondPositiveIndex = -1;
        int min = numbers[0];
        int minIndex = 0;
        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            // position of second positive number
            if (numbers[i] > 0) {
                if (firstPositiveIndex == 0) {
                    firstPositiveIndex = i;
                } else if (secondPositiveIndex == -1) {
                    secondPositiveIndex = i;
                }
            }

            // minimum value and its position in the array
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            //calculate the product of all entered even numbers (exclude 0 from even if entered by user)
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                System.out.println(i + " " + numbers[i]);
                product *= numbers[i];
            }
        }

        System.out.printf("Position of second positive number: %d%n", secondPositiveIndex);
        System.out.printf("Minimum value: %d, position: %d%n", min, minIndex);
        System.out.printf("Product of all even numbers: %d%n", product);
    }
}
