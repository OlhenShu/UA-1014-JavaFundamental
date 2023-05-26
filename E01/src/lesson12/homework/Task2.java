package lesson12.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = readNumber(start, end);
            start = numbers[i] + 1;
        }

        System.out.println("Entered numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Enter a number between " + start + " and " + end + ": ");
                number = scanner.nextInt();
                if (number >= start && number <= end) {
                    break;
                } else {
                    System.out.println("Number is not in the range. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
        return number;
    }
}