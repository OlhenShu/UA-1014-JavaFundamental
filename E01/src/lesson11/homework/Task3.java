package lesson11.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter a text containing US currency format: ");
        String text = scanner.nextLine();

        String currencyPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(text);


        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}

