package com.softserve.edu13.practicalTask;

import java.time.LocalDate;

/**
 * Display the date of the first Monday of the current month.
 */
public class DayOfWeek {
    public static void main(String[] args) {
        System.out.printf("Current day of the week: %s",
                getDayOfWeek());
    }

    private static java.time.DayOfWeek getDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }
}
