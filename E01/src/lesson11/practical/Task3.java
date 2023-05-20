package lesson11.practical;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a username: ");
            String s = scanner.nextLine();

            if (check(s)) {
                System.out.printf("Username is valid");
            } else {
                System.out.println("Username is invalid");
            }
        }
    }

    static boolean check(String s) {
       return Pattern.matches("\\w{3,15}", s);
    }
}
