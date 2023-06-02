package com.softserve.lesson13;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;

public class Lesson13PracticalTask01 {
    public static void main(String[] args) {
        //1. Demonstrate the current day of the week.
        LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfWeek());

        //2. Display the date of the first Monday of the current month.
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(today.with(firstMonInMonth));

        //3. Create a method using Java 8 for sorting a list of Strings.
        var list = new ArrayList<String>();
        list.add("Bob");
        list.add("Alise");
        list.add("Ford");

        System.out.println(list);
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
    }
}
