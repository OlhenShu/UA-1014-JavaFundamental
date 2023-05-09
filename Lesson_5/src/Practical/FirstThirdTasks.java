package Practical;

import java.util.Random;
import java.util.Scanner;

public class FirstThirdTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task task ");
            System.out.println("\t2 - Check second practical task task");
            System.out.println("\t3 - Check third practical task task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstPracticalTasks(scanner);
                case 2 -> secondPracticalTasks(scanner);
                case 3 -> thirdPracticalTasks(random);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

    }


    public static void firstPracticalTasks(Scanner scanner) {
        String[] arrSt = new String[7];
        int[] num = new int[5];
        int checkNumber;
        double sum = 0;
        double average = 0;
        System.out.println("Enter word:");
        for (int i = 0; i < arrSt.length; i++) {
            arrSt[i] = scanner.nextLine();
        }
        for (int i = 0; i < arrSt.length; i++) {
            for (int j = i + 1; j < arrSt.length; j++) {
                if (arrSt[i].length() > arrSt[j].length()) {
                    String temp = arrSt[i];
                    arrSt[i] = arrSt[j];
                    arrSt[j] = temp;
                }
            }
        }
        for (String s : arrSt) {
            System.out.println(s + " ");
        }

        System.out.println("Enter num: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
            average = sum / num.length;
        }
        System.out.println("Sum = " + average);
        System.out.println("Enter num which check: ");
        checkNumber = scanner.nextInt();
        boolean found = false;
        for (int a : num) {
            if (a == checkNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The number " + checkNumber + " was  found in the array.");
        } else {
            System.out.println("The number " + checkNumber + " was not found in the array.");
        }
    }

    public static void secondPracticalTasks(Scanner scanner) {
        int num;
        System.out.println("Enter positive number");
        num = scanner.nextInt();
        boolean isPrime = true;
        if (num == 1 || num == 0) {
            isPrime = false;
        } else {
            for (int i = 2; i < num / 2; ++i) {
                if (num / i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is  a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void thirdPracticalTasks(Random random) {
        int[] numbers = new int[10];
        int max = numbers[0];
        int i;
        int sum = 0;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(21) - 10;
            System.out.print(numbers[i] + " ");
        }
        i = 0;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
        System.out.println("\nMaximum = " + max);
        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        System.out.println("Sum = " + sum);
        i = 0;
        int j = 0;
        for (int number : numbers) {
            if (number < 0) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Count the number of negative numbers = " + i);
        System.out.println("Count the number of positive numbers = " + j);
        if (i > j) {
            System.out.println("There are more negative values in the array.");
        } else if (j > i) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }


    }
}
