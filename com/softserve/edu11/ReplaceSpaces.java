package com.softserve.edu11;

import java.util.Scanner;

//Іnput a sentence that contains words separated by more than one space on the console. The
//goal is to replace all consecutive spaces with a single space. For instance, if you entered the
//sentence "I am learning Java Fundamental", the expected result should be "I am learning
//Java Fundamental ".
public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Sentence after spaces format: %s%n",
                formatSpaces(input.nextLine()));
        input.close();
    }

    public static String formatSpaces(String string) {
        return string.replaceAll("\\s+", " ");
    }
}
