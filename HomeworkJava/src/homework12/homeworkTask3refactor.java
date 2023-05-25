package homework12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class homeworkTask3refactor {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the month number: ");
        try {
            int month = sc.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Invalid month number!");
            } else {
                int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int days = daysInEachMonth[month - 1];
                System.out.println("Number of days in month " + month + ": " + days);
            }
        }catch (InputMismatchException e){
            System.out.println("Enter numbers,try again");
        }
    }
}
