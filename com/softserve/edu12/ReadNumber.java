package com.softserve.edu12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    private static final int start = 1;
    private static final int end = 100;

    public static void main(String[] args) {
        int start = getStart();
        int end = getEnd();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber();

                if (i > 0 && numbers[i] <= numbers[i - 1]) {
                    i--; //return to the previous iteration
                    throw new IllegalArgumentException("The number must be greater than the previous one");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter integer");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Result: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int getStart() {
        return start;
    }

    public static int getEnd() {
        return end;
    }

    public static int readNumber() {
        int start = getStart();
        int end = getEnd();

        Scanner input = new Scanner(System.in);
        int number;
        System.out.printf("Enter a number between [%d-%d]: ", start, end);

        try {
            number = input.nextInt();

            if (number < start || number > end) {
                throw new IllegalArgumentException("The number is not in the available range.");
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input. Please enter integer.");
        }

        return number;
    }
}
