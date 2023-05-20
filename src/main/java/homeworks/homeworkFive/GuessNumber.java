package homeworks.homeworkFive;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rdm = new Random();
        guessNumber(rdm);
    }

    public static void guessNumber(Random rdm) {
        Scanner scanner = new Scanner(System.in);
        int numb;
        int randomNumber = rdm.nextInt(11);
        
        System.out.println("Guess the number in range of '0' - '10'");
        
        while (true) {
            numb = getValidNumber(scanner, "Your number: ");
            if (randomNumber > numb) {
                System.out.println("Too low, try again.");
            } else if (randomNumber < numb) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed number: " + numb);
                break;
            }
        }
        scanner.close();
    }

    public static boolean isInRange(int number) {
        return number >= 0 && number <= 10;
    }

    public static int getValidNumber(Scanner scanner, String prompt) {
        boolean valid = false;
        int number;
        System.out.print(prompt);
        do {
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Please enter an integer number");
            System.out.print(prompt);
            scanner.next();
        }
            number = scanner.nextInt();
            valid = isInRange(number);
            if (!valid) {
                System.out.println("Error. Number is out of range. Must be: '0' - '10'");
                System.out.print(prompt);
            }
        } while (!valid);
        return number;
    }
}
