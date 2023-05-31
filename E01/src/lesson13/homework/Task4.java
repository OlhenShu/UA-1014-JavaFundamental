package lesson13.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1987, 10, 28);
        printDayOfWeek(birthday);
    }

    public static void printDayOfWeek(LocalDate date) {
        var formatter = DateTimeFormatter.ofPattern("EEEE");
        System.out.println("Day of the week " + formatter.format(date));
        System.out.println("Day of the week after 6 months " + formatter.format(date.plusMonths(6)));
        System.out.println("Day of the week after 12 months " + formatter.format(date.plusMonths(12)));
    }
}
