package practical;

import java.util.Arrays;
import java.util.Scanner;


public class PracticalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task task ");
            System.out.println("\t2 - Check second practical task task");
            System.out.println("\t3 - Check third practical task task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstPracticalTasks(scanner);
                case 2 -> secondPracticalTasks(scanner);
                case 3 -> thirdPracticalTasks(scanner);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

    }

    public static void firstPracticalTasks(Scanner scanner) {
        int[] number = new int[6];
        int odd = 0;
        System.out.println("Enter number:");
        for (int i = 0; i < 6; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Our number: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            if (number[i] % 2 != 0) {
                odd++;
            }
        }
        if (odd > 0) {
            System.out.println("There are odd number: " + odd);
        } else {
            System.out.println("There aren't odd numbers");
        }
    }

    public static void secondPracticalTasks(Scanner scanner) {
        System.out.println("enter number of day");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Necessary to enter option 1-7\n");
        }
    }

    public static void thirdPracticalTasks(Scanner scanner) {
        enum Continent{
            AFRICA,
            ANTARCTICA,
            ASIA,
            AUSTRALIA,
            EUROPE,
            NORTH_AMERICA,
            SOUTH_AMERICA
        }
        System.out.println("Enter the name of the country:");
        String countryName= scanner.nextLine().toUpperCase();
        Continent continent;
        switch (countryName) {
            case "USA":
            case "CANADA":
            case "MEXICO":
            case "PANAMA":
                continent = Continent.NORTH_AMERICA;
                break;
            case "ARGENTINA":
            case "BRAZIL":
            case "COLOMBIA":
            case "PERU":
                continent = Continent.SOUTH_AMERICA;
                break;
            case "ALGERIA":
            case "EGYPT":
            case "NIGERIA":
            case "SOUTH AFRICA":
                continent = Continent.AFRICA;
                break;
            case "CHINA":
            case "INDIA":
            case "JAPAN":
            case "RUSSIA":
                continent = Continent.ASIA;
                break;
            case "AUSTRALIA":
            case "NEW ZEALAND":
                continent = Continent.AUSTRALIA;
                break;
            case "FRANCE":
            case "GERMANY":
            case "ITALY":
            case "SPAIN":
                continent = Continent.EUROPE;
                break;
            case "ANTARCTICA":
                continent = Continent.ANTARCTICA;
                break;
            default:
                System.out.println("Sorry, we don't have information about this country's continent.");
                return;
        }
        System.out.println("The continent of " + countryName + " is " + continent);

    }
}
