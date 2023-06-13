package practical.lessonThirteen.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static void main(String[] args) {
        LocalDate currentLocalDate = LocalDate.now();
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(currentLocalDate.with(firstMonInMonth));
    }
}
