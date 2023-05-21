package com.softserve.edu11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//The task requires implementation of a pattern to match US currency format, which includes a
//dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
//is to input a text containing several instances of US currency format via the console. Finally,
//display all the occurrences of US currency format on the console screen.
public class CurrencyFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text containing US currency: ");
        findPrices(input.nextLine());
        input.close();
    }


    private static void findPrices(String string) {
        Pattern regex = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher matcher = regex.matcher(string);

        System.out.println("US currency formats:");
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }
}
