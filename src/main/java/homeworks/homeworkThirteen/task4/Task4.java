package homeworks.homeworkThirteen.task4;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1999, 8, 6);
        printDayOfWeek(birthday);
    }

    public static void printDayOfWeek(LocalDate date) {
        try {
            String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            System.out.println("Day of week: " + dayOfWeek);

            String dayOfWeekAfter6Months = date.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            System.out.println("Day of week after 6 months: " + dayOfWeekAfter6Months);

            String dayOfWeekAfter12Months = date.plusMonths(12).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            System.out.println("Day of week after 12 months: " + dayOfWeekAfter12Months);
        } catch (Exception e) {
            System.out.println("Error occured. " + e.getMessage());
        }
    }
}
