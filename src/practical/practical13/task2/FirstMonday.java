package practical.practical13.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class FirstMonday {
    public static void main(String[] args){
        var firstDayOfMonth = LocalDate.now().with(firstDayOfMonth());
        var firstMonday = firstDayOfMonth.with(firstInMonth(DayOfWeek.MONDAY));
        var formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy",
                new Locale("uk","UA"));
        System.out.println(firstMonday.format(formatter));
    }
}
