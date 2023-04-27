package lesson4.practical;

import java.util.Scanner;

enum Continents {
    AFRICA, ANTARCTICA, ASIA, AUSTRALIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country: ");
        String country = scanner.nextLine();
        Continents continents;
        continents = switch (country) {
            case "Nigeria" -> Continents.AFRICA;
            case "Antarctica" -> Continents.ANTARCTICA;
            case "Japan" -> Continents.ASIA;
            case  "Australia" -> Continents.AUSTRALIA;
            case "Canada" -> Continents.NORTH_AMERICA;
            case "Brazil" -> Continents.SOUTH_AMERICA;
            default -> Continents.EUROPE;
        };
        System.out.println(continents);
        scanner.close();
    }
}
