package homeworks.homeworkEleven.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String pattern = "\\$\\d+\\.\\d{2}";

        Scanner scanner = new Scanner(System.in);
        matchFormat(scanner, pattern);
        scanner.close();
    }

    public static void matchFormat(Scanner scanner, String pattern) {
        System.out.print("Input a text containing several instances of US currency format: ");
        String text = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}
