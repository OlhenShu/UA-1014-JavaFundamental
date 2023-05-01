package lesson5.practical;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int numb = scanner.nextInt();
        if (numb % 2 != 0 && numb % 3 != 0 && numb % 5 != 0) {
            System.out.println("It is a prime number");
        } else {
            System.out.println(" It is not a prime number");
        }
        scanner.close();
    }
}
