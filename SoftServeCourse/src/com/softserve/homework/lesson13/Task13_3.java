package homework.lesson13;

import java.time.LocalDate;
import java.util.*;

public class Task13_3 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Input year which you want to check is it's leap");
        LocalDate year = LocalDate.of(scan.nextInt(),rand.nextInt(1,13), rand.nextInt(1,29));
        if(isYearLeap(year)){
            System.out.println("Year is leap");
        }
        else {
            System.out.println("Year isn't leap");
        }
    }
    public static boolean isYearLeap(LocalDate year){
        return year.isLeapYear();
    }
}
