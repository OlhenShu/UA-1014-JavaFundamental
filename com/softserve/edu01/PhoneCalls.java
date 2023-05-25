package com.softserve.edu01;

import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Three phone calls were made from different countries, each with a different cost per
 * minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the
 * console, calculate the cost of each call and the total cost, and output the results to the
 * console.
 */
public class PhoneCalls extends Calls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Call duration to Ukraine (in seconds)");
            int durationCallUkraine = scanner.nextInt();

            System.out.println("Call duration to Mexico (in seconds)");
            int durationCallMexico = scanner.nextInt();

            System.out.println("Call duration to USA (in seconds)");
            int durationCallUSA = scanner.nextInt();

            Calls calls = new Calls();
            System.out.printf("The cost of your call to Ukraine: %s%n", calls.getPrice("Ukraine", durationCallUkraine));
            System.out.printf("The cost of your call to Mexico: %s%n", calls.getPrice("Mexico", durationCallMexico));
            System.out.printf("The cost of your call to USA: %s%n", calls.getPrice("USA", durationCallUSA));
            System.out.printf("The total cost of all calls: %s%n", calls.getTotal());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid duration (integer).");
        } catch (NoSuchElementException e) {
            System.out.println("Error reading input. Please try again.");
        } finally {
            scanner.close();
        }
    }
}

class Calls {
    private double total = 0;
    private final HashMap<String, Double> tariffs = new HashMap<>();

    public Calls() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Cost per minute to Ukraine (Format double)");
            tariffs.put("Ukraine", scanner.nextDouble());

            System.out.println("Cost per minute to Mexico (Format double)");
            tariffs.put("Mexico", scanner.nextDouble());

            System.out.println("Cost per minute to USA (Format double)");
            tariffs.put("USA", scanner.nextDouble());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid cost (double).");
        } catch (NoSuchElementException e) {
            System.out.println("Error reading input. Please try again.");
        } finally {
            scanner.close();
        }
    }

    public String getPrice(String country, int duration) {
        double price = (tariffs.get(country) / 60) * duration; //price in kopecks
        total += price;

        return format(price);
    }

    public String getTotal() {
        return format(total);
    }

    private String format(double sum) {
        return String.format("%.2f", sum) + " UAH";
    }
}
