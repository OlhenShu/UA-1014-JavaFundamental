package com.softserve.edu04.practicalTask;

import java.util.Scanner;

public class Continent {
    enum ContinentName {
        ASIA, EUROPE, AFRICA, AUSTRALIA, NOT_SPECIFIED
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input country name: ");
        String country = input.nextLine();

        input.close();

        ContinentName continent = getContinent(country.toLowerCase());

        System.out.printf("You entered the page '%s', it is located on the '%s' continent.", country, continent);
    }

    private static ContinentName getContinent(String country) {
        return switch (country) {
            case "china", "india", "japan", "indonesia", "turkey" -> ContinentName.ASIA;
            case "france", "germany", "italy", "spain" -> ContinentName.EUROPE;
            case "egypt", "nigeria", "south africa" -> ContinentName.AFRICA;
            case "australia", "new zealand" -> ContinentName.AUSTRALIA;
            default -> ContinentName.NOT_SPECIFIED;
        };
    }
}
