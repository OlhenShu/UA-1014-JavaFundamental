package com.softserve.edu04.practicalTask;

import java.util.Scanner;

/**
 * Input three numbers from console. Find out and output result how many of them are
 * odd.
 */
public class NumbersOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Input number %d: ", i + 1);
            int number = input.nextInt();

            if (number % 2 != 0) {
                counter++;
            }
        }

        input.close();
        System.out.printf("%d odd numbers", counter);
    }
}
