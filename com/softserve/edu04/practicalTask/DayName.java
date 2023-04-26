package com.softserve.edu04.practicalTask;

import java.util.Scanner;

/**
 * Input from the console the number of the day of the week. Output the name in two
 * languages
 */
public class DayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input day number [0-6]: ");
        int dayNumber = input.nextInt();

        Day day = Day.values()[dayNumber];
        input.close();

        System.out.printf("You asked for a day with an index %d: %s %nThis day has a translation in English (%s) and Ukrainian (%s)", dayNumber, day, day.getEn(), day.getUk());
    }
}
