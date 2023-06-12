package homeworks.homeworkTwelve.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = readNumber(start, end, scanner);
        }

        for (int numb : numbers) {
            System.out.print(numb + " ");
        }
    }

    public static int readNumber(int start, int end, Scanner scanner) {
        int number;

        while (true) {
            System.out.print("Enter a number between " + start + " and " + end + ": ");

            try {
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                if (number > start && number < end) {
                    break;
                } else {
                    System.out.println("Number is out of range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        }
        return number;
    }
}
