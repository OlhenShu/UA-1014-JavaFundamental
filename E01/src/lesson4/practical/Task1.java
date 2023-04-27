package lesson4.practical;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();
        int count=0;
        if (number1 %2 == 1) {
            count++;
        }
        if (number2 %2 == 1) {
            count++;
        }
        if (number3 %2 == 1) {
            count++;
        }
        System.out.println("The number of odd is: " + count);
    }
}


