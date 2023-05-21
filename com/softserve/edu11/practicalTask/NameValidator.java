package com.softserve.edu11.practicalTask;

import java.util.regex.Pattern;

//The task requires validation of usernames using regular expressions. The username should be
//betwixt 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores. To
//accomplish this, input five different usernames in the main method and output a message to the
//console indicating whether each of the entered names is valid or not.
public class NameValidator {
    public static void main(String[] args) {
        String[] names = {
                "Oleksandr",
                "BB",
                "Elena",
                "Дмитро",
                "Jan",
        };

        for (String name : names) {
            if (validate(name)) {
                System.out.printf("Name %s is valid%n", name);
            } else {
                System.out.printf("Name %s is invalid%n", name);
            }
        }
    }

    private static boolean validate(String string) {
        return Pattern.matches("\\w{3,15}", string);
    }
}
