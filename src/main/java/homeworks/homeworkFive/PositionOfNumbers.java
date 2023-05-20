package homeworks.homeworkFive;

import java.util.Scanner;

public class PositionOfNumbers {
    public static void main(String[] args) {
        int[] fiveNumbers = getNumbersFromUser();
        findMinValueAndPosition(fiveNumbers);
        countEvenNumbers(fiveNumbers);
    }

    public static int[] getNumbersFromUser() {
        int[] fiveNumbers = new int[5];
        int count = 1;
        System.out.println("Enter 5 integer numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < fiveNumbers.length; i++) {
            System.out.print("Number " + count + ": " );
            while (!scanner.hasNextInt()) {
                System.out.println("Error. Please enter an integer number");
                scanner.next();
            }
            fiveNumbers[i] = scanner.nextInt();
            count++;
        }
        scanner.close();
        return fiveNumbers;
    }

    public static void findMinValueAndPosition(int[] numbers) {
        int min = 0;
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) min = numbers[i];
            position = i;
        }
        System.out.println("Minimum value of the aray: " + min + "\t Position: " + position);
    }

    public static void countEvenNumbers(int[] numbers) {
        int evenNums = 0;
        for (int number : numbers) {
            if (number > 0 && number % 2 == 0) evenNums++;
        }
        System.out.println("Even numbers: " + evenNums);
    }
}
