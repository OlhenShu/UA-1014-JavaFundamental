package lesson13.homework;

import java.util.Scanner;

public class Task3 {
    public static boolean isLeapYear (int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to be checked: ");
        int year = scanner.nextInt();

        System.out.println("Is leap year? " + isLeapYear(year));
    }
}
