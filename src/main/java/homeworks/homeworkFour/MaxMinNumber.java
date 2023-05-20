package homeworks.homeworkFour;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("\nEnter the first number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("\nEnter the first number: ");
        int thirdNumber = scanner.nextInt();
        scanner.close();

        int maxNumb = checkMaxNumber(firstNumber, secondNumber, thirdNumber);
        int minNumb = checkMinNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println("Maximum number: " + maxNumb + "\tMinimum number: " + minNumb);
    }

    public static int checkMaxNumber(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) max = a;
        if (b > a && b > c) max = b;
        if (c > a && c > b) max = c;
        return max;
    }

    public static int checkMinNumber(int a, int b, int c) {
        int min = 0;
        if (a < b && a < c) min = a;
        if (b < a && b < c) min = b;
        if (c < a && c < b) min = c;
        return min;
    }
}
