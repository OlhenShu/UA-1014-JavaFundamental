package homeworks.homeworkThirteen.task3;

import java.time.LocalDate;

public class Task3 {
    public static void main(String[] args) {
        LocalDate currentYear = LocalDate.now();
        boolean isLeap1 = isLeapYear(currentYear.getYear());

        System.out.println("Year is leap: " + isLeap1);
        boolean isLeap2 = isLeapYear(2020);
        System.out.println("Year is leap: " + isLeap2);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    
}
