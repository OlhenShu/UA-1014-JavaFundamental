package lesson12.practical;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the length of the rectangle: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the width of the rectangle: ");
            int b = Integer.parseInt(scanner.nextLine());

            int area = squareRectangle(a, b);
            System.out.println("The area is: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for length and width.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Length and width should be positive values.");
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Length and width should be positive values.");
        }
        return a * b;
    }
}

