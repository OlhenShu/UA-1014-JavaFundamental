package com.softserve.lesson04;

import java.util.Scanner;

public class Lesson04Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 400 -> System.out.println("Bad Request");
            case 401 -> System.out.println("Unauthorized");
            case 402 -> System.out.println("Payment Required");
            case 403 -> System.out.println("Forbidden");
            case 404 -> System.out.println("Not Found");
            case 405 -> System.out.println("Method Not Allowed");
            case 406 -> System.out.println("Not Acceptable");
            case 407 -> System.out.println("Proxy Authentication Required");
            case 408 -> System.out.println("Request Timeout");
            case 409 -> System.out.println("Conflict");
            case 410 -> System.out.println("Gone");
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }
}
