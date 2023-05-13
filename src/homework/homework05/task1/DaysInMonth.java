package homework.homework05.task1;

import java.util.Scanner;

public class DaysInMonth {
    private static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print( "Please, enter number of month: ");
        int numberMonth = sc.nextInt();
        while (numberMonth > 12 || numberMonth <= 0) {
            System.out.print("Your number is incorrect. Please enter correct number of month: ");
            numberMonth = sc.nextInt();
        }
        System.out.println("In this month " + monthDays[--numberMonth] + " days.");
        //sc.close();
    }

}
