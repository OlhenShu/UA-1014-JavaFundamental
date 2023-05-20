package practical.lessonFour;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number of the day of week: ");
        int day = scanner.nextInt();

        String dayOfWeek = switch(day) {
            case 0 -> "EN: Sunday\tUA: Неділя";
            case 1 -> "EN: Monday tUA: Понеділок";
            case 2 -> "EN: Tuesday\tUA: Вівторок";
            case 3 -> "EN: Wednesday\tUA: Середа";
            case 4 -> "EN: Thursday\tUA: Четвер";
            case 5 -> "EN: Friday\tUA: П'ятниця";
            case 6 -> "EN: Saturday\tUA: Субота";
            default -> "Such day not found.";
        };
        System.out.println(dayOfWeek);
        scanner.close();
    }
}
