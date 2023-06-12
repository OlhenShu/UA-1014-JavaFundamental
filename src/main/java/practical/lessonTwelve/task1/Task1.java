package practical.lessonTwelve.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int a = getNumeric(scanner, "Enter the value for length: ");
            int b = getNumeric(scanner, "Enter the vlaue for width: ");

            int area = squareRectangle(a, b);
            System.out.println("Area of the rectangle: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. The values must be numeric");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. The values must be positive");
        }
        scanner.close();
        
    }

    public static int squareRectangle(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return a * b;
    }

    public static int getNumeric(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String p = "\\d+";
        String input = scanner.nextLine();
        if (!input.matches(p)) throw new NumberFormatException();
        return Integer.parseInt(input);
    }
}
