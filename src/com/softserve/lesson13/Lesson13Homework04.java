package com.softserve.lesson13;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Lesson13Homework04 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2023, Month.JANUARY, 1);
        printDay(birthday);
    }

    public static void printDay(LocalDate localDate) {
        try {
            System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("uk", "UA")));

            LocalDate localDateMonth = localDate.plusMonths(6);
            System.out.println(localDateMonth.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("uk", "UA")));

            LocalDate localDateYear = localDate.plusMonths(12);
            System.out.println(localDateYear.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("uk", "UA")));
        } catch (NullPointerException e) {
            System.out.println("Locale. Throws: NullPointerException – thrown if either argument is null");
        }
    }
}
