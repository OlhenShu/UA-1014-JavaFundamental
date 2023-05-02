package com.softserve.edu05.practicalTask;

import java.util.Scanner;

/**
 * Write a Java program that asks the user to enter a positive integer and determines
 * whether it is a prime number. If the number is prime, output a message “Is a prime
 * number”. Otherwise, output a message “Is not prime number”.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        input.close();

        System.out.print(isPrime(number) ? "Is a prime number." : "Is not a prime number.");
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
