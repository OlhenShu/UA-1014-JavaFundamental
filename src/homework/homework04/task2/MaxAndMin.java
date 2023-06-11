package homework.homework04.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxAndMin {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int first_num = getNumber("Please enter an integer: ");
        int second_num = getNumber("Please enter the next integer: ");
        int third_num = getNumber("Please enter another next integer: ");
        //sc.close();

        int max = (first_num > second_num) ? first_num : second_num;
        max = (third_num > max) ? third_num : max;

        int min = (first_num < second_num) ? first_num : second_num;
        min = (third_num < min) ? third_num : min;

        System.out.println("The maximum number of entered = " + max);
        System.out.println("The minimum number entered = " + min);

    }
    static int getNumber(String prompt) {
        System.out.print(prompt);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.nextLine();
            return getNumber(prompt);
        }
    }
}
