package homeworks.homeworkFive;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month = scanner.nextInt();
        scanner.close();
        if (month >= 1 && month <= 12) {
            System.out.println("\nMonth " + month + " contains " + daysInMonth[month - 1] + " days");
        } else {
            System.out.println("\nUnknown month: " + month);
        }
    }
}
