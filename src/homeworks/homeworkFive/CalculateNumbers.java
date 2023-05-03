package homeworkFive;

import java.util.Scanner;

public class CalculateNumbers {
    public static void main(String[] args) {
        int[] tenNumbers = getNumbersFromUser();
        printNumbers(tenNumbers);
        sumOfNumbers(tenNumbers);
    }

    public static int[] getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int[] tenNumbers = new int[10];
        int count = 1;
        System.out.print("Enter 10 numbers: \n");
        for (int i = 0; i < tenNumbers.length; i++) {
            System.out.print("Number " + count + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error. Please enter an integer");
                scanner.next();
            }
            tenNumbers[i] = scanner.nextInt();
            count++;
        }
        scanner.close();
        return tenNumbers;
    }

    public static void printNumbers(int[] numbers) {
        System.out.print("\nYou have entered: ");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }
    
    public static void sumOfNumbers(int[] numbers) {
        int sum  = 0;
        int count2 = 0;

        for (int i = 0; i < numbers.length - 5; i++) {
            if (numbers[i] >= 0) count2++;
        }

        if (count2 == 5) {
            for (int i = 0; i < numbers.length - 5; i++) {
                sum += numbers[i];
            }
            System.out.println("\nThe sum of 1-5 numbers is: " + sum);
        } else {
            for (int i = 5; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("\nThe sum of 6-10 numbers is: " + sum);
        }
    }
}
