package homeworks.homeworkFour;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("\nEnter the second number: ");
        float secondNumber = scanner.nextFloat();
        System.out.print("\nEnter the third number: ");
        float thirdNumber = scanner.nextFloat();
        scanner.close();

        boolean result = ifOutOfRange(firstNumber, secondNumber,thirdNumber);
        System.out.println(result);
    }

    public static boolean ifOutOfRange(float a, float b, float c) {
        if (a > 5 || a < -5) return false;
        if (b > 5 || b < -5) return false;
        if (c > 5 || c < -5) return false;
        return true;
    }
}
