package homework.homework05.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysInMonth {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numberMonth = getMonthDay("Please, enter number of month: ");
        System.out.println("In this month " + monthDays[--numberMonth] + " days.");
        //sc.close();
    }

    static int getMonthDay(String prompt) {
        System.out.print(prompt);
        try {
            int numberMonth = sc.nextInt();
            while (numberMonth > 12 || numberMonth <= 0) {
                System.out.print("Your number is incorrect. Please enter the correct number of the month: ");
                numberMonth = sc.nextInt();
            }
            return numberMonth;
        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.nextLine();
            return getMonthDay(prompt);
        }
    }
}
