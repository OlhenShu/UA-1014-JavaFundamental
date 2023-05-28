package com.softserve.edu13;

//import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a method that takes a year as a parameter and returns true if the year is a leap
 * year.
 */
public class LeapYear {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int year = input.nextInt();
            String isLeap = isLeapYear(year) ? "leap" : "not leap";

            System.out.printf("Year %d is %s", year, isLeap);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        }
    }
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    // alternative methods
//    private static boolean isLeapYear(int year) {
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.YEAR, year);
//
//        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
//    }

//    private static boolean isLeapYear(int year) {
//        return new GregorianCalendar().isLeapYear(year);
//    }

//    private static boolean isLeapYear(int year) {
//        return java.time.Year.of(year).isLeap();
//    }
}
