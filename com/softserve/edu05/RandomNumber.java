package com.softserve.edu05;

import java.util.Random;
import java.util.Scanner;

/**
 * Create a program that generates a random number and prompts to the user to guess
 * what the number is. If the user's guess is higher than the random number, the program
 * should display "Too high, try again." If the user's guess is lower than the random number,
 * the program should display "Too low, try again." The program should use a loop that
 * repeats until the user correctly guesses the random number
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;

        int inputNumber;

        do {
            System.out.print("Enter number (1-100): ");
            inputNumber = scanner.nextInt();

            if (inputNumber > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (inputNumber < randomNumber) {
                System.out.println("Too low, try again.");
            }
        } while (inputNumber != randomNumber);

        System.out.println("Congratulations! You guessed the number.");
    }
}
