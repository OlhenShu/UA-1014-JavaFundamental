package lesson11.practical;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two variables");
        String variable1 = scanner.nextLine();
        String variable2 = scanner.nextLine();

        if (variable2.indexOf(variable1) != -1) {
            System.out.println("First variable is a substring of the second variable");
        } else {
            System.out.println("First variable is not a substring of the second variable");
        }

        scanner.close();
    }
}
