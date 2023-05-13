package homework.homework04.task2;

import java.util.Scanner;

public class MaxAndMin {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int first_num = getNumber(sc,"Please enter an integer: ");
        int second_num = getNumber(sc,"Please enter the next integer: ");
        int third_num = getNumber(sc,"Please enter another next integer: ");
        //sc.close();

        int max = (first_num > second_num) ? first_num : second_num;
        max = (third_num > max) ? third_num : max;

        int min = (first_num < second_num) ? first_num : second_num;
        min = (third_num < min) ? third_num : min;

        System.out.println("The maximum number of entered = " + max);
        System.out.println("The minimum number entered = " + min);

    }
    static int getNumber(Scanner sc,String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }
}
