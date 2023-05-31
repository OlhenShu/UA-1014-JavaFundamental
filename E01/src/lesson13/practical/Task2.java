package lesson13.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Task2 {
    public static void main(String[] args) {
        var today = LocalDate.now().withDayOfMonth(1);
        var firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        var firstMonday = firstDayOfMonth.with(firstInMonth(DayOfWeek.MONDAY));

        System.out.println(firstMonday);
    }
}
