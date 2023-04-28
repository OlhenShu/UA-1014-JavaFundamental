package practical.practical04.task3;

import homework.homework04.task3.HTTPError;

import java.util.Scanner;

public enum Continent {
    EURASIA("Eurasia"), AFRICA("Africa"), NA("North America"), SA("South America"), ANTARCTICA("Antarctica"),
    AUSTRALIA("Australia");
    private final String continent;

    Continent(String continent){
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the country: ");

        Continent yourContinent = null;

        switch (sc.nextLine().toLowerCase()) {
            case "france", "ukraine", "deutschland" -> yourContinent = Continent.EURASIA;
            case "nigeria ", "egypt", "ethiopia" -> yourContinent = Continent.AFRICA;
            case "united states", "nicaragua", "mexico","canada" -> yourContinent = Continent.NA;
            case "brazil", "argentina", "peru" -> yourContinent = Continent.SA;
            case "" -> yourContinent = Continent.ANTARCTICA;
            case "australia" -> yourContinent = Continent.AUSTRALIA;
            default -> System.out.println("Please enter another country.");
        }
        System.out.println("This country is located on the continent of " + yourContinent.getContinent());

    }
}
