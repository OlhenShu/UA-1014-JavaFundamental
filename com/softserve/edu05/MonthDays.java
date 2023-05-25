package com.softserve.edu05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a program (in different java documents) that prompts the user to enter:
 * • a month number and calculates the number of days in that month based on an array
 * that contains the number of days in each month.
 */
public class MonthDays {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a month number: ");
            int monthNumber = input.nextInt();

            if (monthNumber >= 1 && monthNumber <= 12) {
                int days = daysInMonth[monthNumber - 1];

                System.out.printf("The month you have chosen has %d days", days);
            } else {
                System.out.println("Please, enter a valid number of month [1-12]");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid month number. Please enter a valid number of month [1-12].");
        } finally {
            input.close();
        }
    }
}
