package homework.homework13.task3;

import java.time.LocalDate;

public class LeapYear {
    public static void main(String[] args) {
        var today = LocalDate.now();
        var year = today.getYear();
        if (ifLeapYear(year)){
            System.out.println("This year is leap year.");
        }else {
            System.out.println("This year is not leap year.");
        }
    }

    public static Boolean ifLeapYear(int year) {
        LocalDate localDate = LocalDate.of(year, 2, 1);
        System.out.println(localDate.lengthOfMonth());
        return localDate.lengthOfMonth() == 29;
    }
}
