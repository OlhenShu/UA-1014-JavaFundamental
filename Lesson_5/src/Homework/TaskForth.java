package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskForth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first  Home task ");
            System.out.println("\t2 - Check second Home  task");
            System.out.println("\t3 - Check third Home  task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstTask(scanner);
                case 2 -> secondTask(scanner);
                case 3 -> forthTask(scanner);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

    }

    private static void firstTask(Scanner scanner) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check item first");
            System.out.println("\t2 - Check item second");
            System.out.println("\t3 - Check item third");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> itemFirstTask(scanner);
                case 2 -> itemSecondTask(scanner);
                case 3 -> itemThirdTask(scanner);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

    }

    private static void itemFirstTask(Scanner scanner) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        int days = daysInMonth[month - 1];
        System.out.printf("The month %d has %d days.\n", month, days);
    }

    private static void itemSecondTask(Scanner scanner) {
        int[] num = new int[10];
        int sum = 0;
        int product = 1;
        boolean isPositive = true;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }
        System.out.println("Our number" + Arrays.toString(num));

        for (int i = 0; i < 5; i++) {
            if (num[i] < 0) {
                isPositive = false;
                break;
            }
            sum += num[i];
        }
        if (isPositive) {
            System.out.println("The sum of the first five elements is: " + sum);
        } else {
            for (int i = 5; i < 10; i++) {
                product *= num[i];
            }
            System.out.println("The product of the last five elements is: " + product);
        }
    }


    private static void itemThirdTask(Scanner scanner) {
        int[] num = new int[5];
        int positiveCount = 0;
        int secondPositivePosition = -1;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            num[i] = scanner.nextInt();
            if (num[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    secondPositivePosition = i;
                }
            }
        }
        if (secondPositivePosition == -1) {
            System.out.println("There is no second positive number.");
        } else {
            System.out.println("The position of the second positive number is " + (secondPositivePosition + 1));
        }

        int min = num[0];
        int position = 0;
        for (int i = 0; i < 5; i++) {
            if (num[i] < min) {
                min = num[i];
                position = i;
            }
        }
        System.out.println("Minimum value is " + min + " at position " + position);
        int product=1;
        for (int i = 0; i < 5; i++) {
            if (num[i] != 0 && num[i] % 2 == 0) {
                product *= num[i];
            }
        }
        System.out.println("The product of all entered even numbers is: " + product);
    }


    private static void secondTask(Scanner scanner) {
        String choice;
        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            System.out.print("Do you want to perform the operation again? (Y/N): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("Y"));
    }

    public static void forthTask(Scanner scanner) {
        Random random = new Random();
        int inputNumber;
        int numberOfMoves = 0;
        int guessedNumber = random.nextInt(100) + 1;
        boolean win = false;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        while (!win) {
            System.out.print("Enter your guess: ");
            inputNumber = scanner.nextInt();
            numberOfMoves++;
            if (guessedNumber == inputNumber) {
                System.out.println("You win");
                win = true;
            } else if (guessedNumber < inputNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }

        }
        System.out.println("you won for " + numberOfMoves + " moves");

    }
}


