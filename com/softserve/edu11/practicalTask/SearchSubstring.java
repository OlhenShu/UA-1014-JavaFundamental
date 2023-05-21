package com.softserve.edu11.practicalTask;

import java.util.Scanner;

//Input two String variables. Verify if the first variable is a substring of the second variable. For
//instance, if you entered "SoftServe" and "SoftServe Academy", the expected result should be
//true.
public class SearchSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter fragment to search substring:");
        String needle = input.nextLine();

        System.out.println("Enter string:");
        String string = input.nextLine();

        System.out.printf("Search check case sensitive: %b%n",
                inString(needle, string, false));
        System.out.printf("Search check case insensitive: %b%n",
                inString(needle, string, true));
    }

    /**
     * The method searches for a substring with an optional case sensitivity parameter
     * @param needle String
     * @param haystack String
     * @param caseSensitive boolean
     * @return boolean
     */
    private static boolean inString(String needle, String haystack, boolean caseSensitive) {
        if (caseSensitive) {
            return haystack.toLowerCase().contains(needle.toLowerCase());
        }

        return haystack.contains(needle); //haystack.indexOf(needle) != -1
    }
}
