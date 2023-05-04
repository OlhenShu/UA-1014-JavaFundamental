package com.lesson4;

import java.util.Scanner;


public class pract2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day of week:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}