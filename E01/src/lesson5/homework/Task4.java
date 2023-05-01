package lesson5.homework;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int randomNumber = random.nextInt(10);
        System.out.println("Try to guess! Enter the number between 0 and 9");
        do {
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.println("Too high, try again");
            } else if (number < randomNumber) {
                System.out.println("Too low, try again");
            } else System.out.println("Well done! Random number = " + randomNumber);
        }
        while (number != randomNumber);
        scanner.close();
    }
}
