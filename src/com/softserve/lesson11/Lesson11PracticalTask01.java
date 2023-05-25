package com.softserve.lesson11;

import java.util.Scanner;

public class Lesson11PracticalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input string1: ");
        String fragment = scanner.nextLine();
        System.out.print("Input string2: ");
        String text = scanner.nextLine();

        System.out.println(text.contains(fragment));
    }
}
