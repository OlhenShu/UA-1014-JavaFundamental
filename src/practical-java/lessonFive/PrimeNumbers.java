package lessonFive;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive prime number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 0) {
            System.out.println("\nError. " + number + " is not a positive number");
        } else {
            if (!ifPrimeNumber(number)) System.out.println("\nError. " + number + " is not a prime number");
            if (ifPrimeNumber(number)) System.out.println("\n" + number + " is a prime number");
        }
    }

    public static boolean ifPrimeNumber(int number) {
        if (number > 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
