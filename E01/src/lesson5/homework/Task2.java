package lesson5.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        do {
            System.out.println("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1+num2;
            System.out.println("The sum = " + sum);
            System.out.println("Do you want to repeat? Press 1 to continue, press 0 to qiut");
            int answer = scanner.nextInt();
            if (answer==0) {
                condition=false;
            }
        } while (condition);
        System.out.println("The end");
    }
}
