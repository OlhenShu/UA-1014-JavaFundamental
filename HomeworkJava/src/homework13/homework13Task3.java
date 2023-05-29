package homework13;
import java.util.Scanner;
import java.time.Year;

public class homework13Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check the leap year");

        int year = scanner.nextInt();
        boolean leapYear = isLeapYear(year);
        System.out.println(year + " the leap year: " + leapYear);
    }
     static boolean isLeapYear(int year){
        return Year.of(year).isLeap();
    }

}
