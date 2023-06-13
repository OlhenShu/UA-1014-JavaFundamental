package practical.lessonThirteen.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        DayOfWeek currentDayOfWeek = DayOfWeek.from(LocalDate.now());
        System.out.println("Current day of week: " + currentDayOfWeek.toString().toLowerCase());
    }
}
