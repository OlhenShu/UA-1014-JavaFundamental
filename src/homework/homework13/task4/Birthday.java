package homework.homework13.task4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

import static java.time.Period.*;

public class Birthday {
    public static void main(String[] args) {
        LocalDate birthdayDate = LocalDate.of(1995, 9, 27);
        try {
            printWeek(birthdayDate);
        }catch (Throwable t){
            System.out.println(t.getMessage());
        }
    }
    public static void printWeek(LocalDate date){
        var formatter = DateTimeFormatter.ofPattern("EEEE");
        System.out.printf("Day of the week \"%s\", %n" +
                        "Day of the week after 6 months \"%s\", %n" +
                        "Day of the week after 12 months \"%s\"",
                        formatter.format(date),
                        formatter.format(date.plusMonths(6)),
                        formatter.format(date.plusMonths(12)));
    }
}
