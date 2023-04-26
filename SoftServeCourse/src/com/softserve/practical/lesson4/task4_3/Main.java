package task4_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the country from the suggested ones - \nFrance,Brazil,Nigeria,Canada,Japan,Germany\n" +
                "Australia,Egypt,USA,Argentina,China,Ghana\nUkraine,Mexico,India,New Zealand,Benin,Spain\nChile,Cuba,South Africa," +
                "Pakistan,Italy\nColombia,Algeria,Honduras,Papua New Guinea,South Korea,Swede\nPeru,Sudan,Jamaica,Malaysia,Great Britain,Uruguay\n" +
                "Haiti,Mali,Poland,Ecuador,Indonesia ");
        String country = scan.nextLine().toLowerCase();
        scan.close();
        Continent continent =
        switch (country) {
            case "france","germany","ukraine","spain","italy","sweden","great britain","poland" -> Continent.EUROPE;
            case "japan","china","india","pakistan","south korea","malaysia","indonesia" -> Continent.ASIA;
            case "canada","usa","mexico","cuba","honduras","jamaica","haiti" -> Continent.NORTH_AMERICA;
            case "brazil","argentina","chile","colombia","peru","uruguay","ecuador" -> Continent.SOUTH_AMERICA;
            case "nigeria","egypt","ghana","benin","south africa","sudan","algeria","mali" -> Continent.AFRICA;
            case "australia","new zealand","papua new guinea" -> Continent.AUSTRALIA;
            default -> Continent.UNKNOWN_COUNTRY;
        };
        System.out.println(continent);
    }
}
