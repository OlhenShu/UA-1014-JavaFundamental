package homeworks;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        homeWorkFirst(scanner);
        homeWorkSecond();
        homeWorkThird();

    }

    public static void homeWorkFirst(Scanner scanner) {

        System.out.println("enter number:");
        float a = scanner.nextFloat();
        System.out.println("enter number:");
        float b = scanner.nextFloat();
        System.out.println("enter number:");
        float c = scanner.nextFloat();
        if (5 >= a && a >= -5 && 5 >= b && b >= -5 && 5 >= c && c >= -5) {
            System.out.println("number is in range[-5,5]");
        } else {
            System.out.println("number isn't in range[-5,5]");
        }
        if (5 >= b && b >= -5) {
            System.out.println("number is in range[-5,5]");
        } else {
            System.out.println("number isn't in range[-5,5]");
        }
        if (5 >= c && c >= -5) {
            System.out.println("number is in range[-5,5]");
        } else {
            System.out.println("number isn't in range[-5,5]");
        }

    }

    public static void homeWorkSecond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int a = scanner.nextInt();
        System.out.println("enter number:");
        int b = scanner.nextInt();
        System.out.println("enter number:");
        int c = scanner.nextInt();
        int max = a;
        int min = a;
        if (b > max) {
            max = b;
        } else if (max < c) {
            max = c;
        }
        if (min > b) {
            min = b;
        } else if (min > c) {
            min = c;
        }
        System.out.println("max number:" + max + "\nmin number:" + min);
        scanner.close();
    }

    public static void homeWorkThird() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number error");
        int whatTheError = scanner.nextInt();
        if (whatTheError == 100 || whatTheError == 101 || whatTheError == 102 || whatTheError == 103) {
            System.out.println(WhatTheError.INFO);
        }
        if (whatTheError == 200 || whatTheError == 201 || whatTheError == 202) {
            System.out.println(WhatTheError.SUCCESS);
        }
        if (whatTheError == 300 || whatTheError == 301 || whatTheError == 302) {
            System.out.println(WhatTheError.REDIRECTION);
        }
        if (whatTheError == 400 || whatTheError == 401 || whatTheError == 402) {
            System.out.println(WhatTheError.CLIENTERROR);
        }
    }


}