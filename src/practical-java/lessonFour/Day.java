package lessonFour;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number of the day of week: ");
        int day = scanner.nextInt();

        switch(day) {
            case 0: System.out.println("EN: Sunday \tDE: Sonntag"); break;
            case 1: System.out.println("EN: Monday \tDE: Montag"); break;
            case 2: System.out.println("EN: Tuesday \tDE: Dienstag"); break;
            case 3: System.out.println("EN: Wednesday \tDE: Mittwoch"); break;
            case 4: System.out.println("EN: Thursday \tDE: Donnerstag"); break;
            case 5: System.out.println("EN: Friday \tDE: Freitag"); break;
            case 6: System.out.println("EN: Saturday \tDE: Samstag"); break;
            default: System.out.println("Such day not found.");
        }
        scanner.close();
    }
}
