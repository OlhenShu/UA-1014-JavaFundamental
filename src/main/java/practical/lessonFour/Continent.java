package practical.lessonFour;

import java.util.Scanner;

public class Continent {

    enum ContinentName {
        NORTH_AMERICA, SOUTH_AMERICA, AFRICA, ANTARCTICA, ASIA, EUROPE, AUSTRALIA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String countryName = scanner.nextLine().toLowerCase();
        scanner.close();  
        ContinentName continent = getContinentByCountry(countryName);

        if (continent != null) {
            System.out.println("The continent of " + countryName + " is " + continent);
        } else {
            System.out.println("Not found");
        }
    }

    public static ContinentName getContinentByCountry(String country) {
        switch(country) {
            case "germany": case "spain": case "france": case "poland": case "ukraine": return Continent.ContinentName.EUROPE;
            case "china": case "india": case "japan": case "korea": case "indonesia": case "philippines": case "uzbekistan": case "malaysia": return Continent.ContinentName.ASIA;
            case "nigeria": case "ethiopia": case "egypt": case "tanzania": case "south africa": case "morocco": case "niger": return Continent.ContinentName.AFRICA;
            case "brazil": case "colombia": case "argentina": case "peru": case "chile": case "venezuela": return Continent.ContinentName.SOUTH_AMERICA;
            case "u.s.a.": case "mexico": case "canada": case "cuba": case "dominican republic": case "honduras": case "jamaica": return Continent.ContinentName.NORTH_AMERICA;
            case "australia": case "papua new guinea": case "new zealand": return Continent.ContinentName.AUSTRALIA;
            case "antarctica": return Continent.ContinentName.ANTARCTICA;
            default: return null;
        }
    }
}

