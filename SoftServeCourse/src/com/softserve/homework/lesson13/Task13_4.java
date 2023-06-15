package homework.lesson13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task13_4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1998,11,30);
        try {
            dayOfTheWeekMyBirthday(birthday);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void dayOfTheWeekMyBirthday(LocalDate birthday) {
        DayOfWeek myBirthdayDay = birthday.getDayOfWeek();
        DayOfWeek myBirthAfterSixMonth = birthday.plusMonths(6).getDayOfWeek();
        DayOfWeek myBirthdayAfterTwelveMonth = birthday.plusMonths(12).getDayOfWeek();
        System.out.println("My birthday fell on " + myBirthdayDay);
        System.out.println("Six months after my birthday was " + myBirthAfterSixMonth);
        System.out.println("Twelve months after my birthday was " + myBirthdayAfterTwelveMonth);
    }
}
