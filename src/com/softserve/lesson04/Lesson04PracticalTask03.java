package com.softserve.lesson04;

import java.util.Scanner;

public class Lesson04PracticalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        switch (country) {
            case "United Kingdom", "France", "Germany" -> System.out.println(continent.EUROPE);

            case "China", "Japan", "India" -> System.out.println(continent.ASIA);

            case "USA", "Canada", "Brazil" -> System.out.println(continent.AMERICA);

            case "Egypt", "South Africa", "Nigeria" -> System.out.println(continent.AFRICA);

            case "Australia" -> System.out.println(continent.AUSTRALIA);

            default -> throw new IllegalStateException("Unexpected value: " + country);
        }
    }
}

enum continent {
    EUROPE, ASIA, AMERICA, AFRICA, AUSTRALIA;
}


