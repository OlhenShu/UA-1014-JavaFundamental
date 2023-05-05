package com.softserve.lesson04;

import java.util.Scanner;

public class Lesson04PracticalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of the day of the week = ");
        int numb = scanner.nextInt();

        DayOfWeek dayOfWeek = switch (numb) {
            case 1 -> DayOfWeek.MONDAY;
            case 2 -> DayOfWeek.TUESDAY;
            case 3 -> DayOfWeek.WEDNESDAY;
            case 4 -> DayOfWeek.THURSDAY;
            case 5 -> DayOfWeek.FRIDAY;
            case 6 -> DayOfWeek.SATURDAY;
            case 7 -> DayOfWeek.SUNDAY;
            default -> throw new IllegalStateException("Unexpected value: " + numb);
        };

        System.out.println(dayOfWeek.getUa());
        System.out.println(dayOfWeek.getFr());
    }
}

enum DayOfWeek {
    MONDAY("Понеділок", "Lundi"),
    TUESDAY("Віторок", "Mardi"),
    WEDNESDAY("Середа", "Mercredi"),
    THURSDAY("Четвер", "Jeudi"),
    FRIDAY("П'ятниця", "Vendredi"),
    SATURDAY("Субота", "Samedi"),
    SUNDAY("Неділя", "Dimanche");

    private final String ua;
    private final String fr;

    DayOfWeek(String ua, String fr) {
        this.ua = ua;
        this.fr = fr;
    }

    public String getUa() {
        return ua;
    }

    public String getFr() {
        return fr;
    }
}
