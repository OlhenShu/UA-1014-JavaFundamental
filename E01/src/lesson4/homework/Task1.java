package lesson4.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float number1 = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        float number2 = scanner.nextFloat();
        System.out.println("Enter the third number: ");
        float number3 = scanner.nextFloat();
        if ((number1 >= -5 &&  number1 <= 5) && (number2 >= -5 &&  number2 <= 5) && (number3 >= -5 &&  number3 <= 5)) {
            System.out.println("All numbers belong to the range");
        }
        else System.out.println("All numbers do not belong to the range");
    scanner.close();
    }
}
