package lesson4.practical;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day");
        String num = String.valueOf(scanner.nextInt());
        String result1 = switch (num) {
            case "1" -> "Monday";
            case "2" -> "Tuesday";
            case "3" -> "Wednesday";
            case "4" -> "Thursday";
            case "5" -> "Friday";
            case "6" -> "Saturday";
            case "7" -> "Sunday";
            default -> "Wrong number!";
        };
        System.out.println(result1);
        String result2 = switch (num) {
            case "1" -> "Понеділок";
            case "2" -> "Вівторок";
            case "3" -> "Середа";
            case "4" -> "Четвер";
            case "5" -> "Пятниця";
            case "6" -> "Субота";
            case "7" -> "Неділя";
            default -> "Невірне число!";
        };
        System.out.println(result2);
    }
}
