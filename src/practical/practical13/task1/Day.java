package practical.practical13.task1;

import java.time.LocalDate;
import java.time.ZoneId;

public class Day {
    public static void main(String[] args){
        var today = LocalDate.now(ZoneId.of("Europe/Kyiv"));
        var day = today.getDayOfWeek();
        System.out.println(day);
    }
}
