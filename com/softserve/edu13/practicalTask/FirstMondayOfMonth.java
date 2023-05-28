package com.softserve.edu13.practicalTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Demonstrate the current day of the week.
 */
public class FirstMondayOfMonth {
    static LocalDate localDate = LocalDate.now();
    public static void main(String[] args) {
        System.out.printf("The first Monday of the current month: %s",
                getFirstMondayOfMonth());
    }

    private static LocalDate getFirstMondayOfMonth() {
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        return localDate.with(firstMonInMonth);
    }
}
