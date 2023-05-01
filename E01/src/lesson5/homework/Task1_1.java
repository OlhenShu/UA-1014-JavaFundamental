package lesson5.homework;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number");
        int num = scanner.nextInt();
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Month " + num + " has " + arr[num + 1] + " days");
        scanner.close();
    }
}
