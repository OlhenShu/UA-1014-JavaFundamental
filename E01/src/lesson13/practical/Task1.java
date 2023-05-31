package lesson13.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        var today = LocalDate.now();

        var dayOfWeek = today.getDayOfWeek();

        System.out.println("Current day of the week: " + dayOfWeek);
    }
}
