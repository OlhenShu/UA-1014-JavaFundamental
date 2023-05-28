package com.softserve.edu13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Create a variable "birthday" of type "LocalDate" and set it to the date of your birthday.
 * Then create a method that takes a "LocalDate" object as a parameter, and prints the day of
 * the week it falls on, as well as the day of the week after 6 months and 12 months have
 * passed.
 * **Additionally, the method should only print the day of the week in English if the default
 * locale is set to English. Otherwise, it should print the day of the week in the language of
 * the default locale. Finally, the method should handle any exceptions that may occur during
 * the date calculation process and print an appropriate error message.
 */
public class Birthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1999, 8, 17);

        printDayInfo(birthday);
    }

    private static void printDayInfo(LocalDate date) {
        try {
            Locale defaultLocale = Locale.getDefault();

            DateTimeFormatter formatter = DateTimeFormatter
                    .ofLocalizedDate(FormatStyle.FULL)
                    .withLocale(defaultLocale);

            System.out.printf("Day of the week: %s%n",
                    date.format(formatter));
            System.out.printf("Day of the week after 6 months: %s%n",
                    date.plusMonths(6).format(formatter));
            System.out.printf("Day of the week after 12 months: %s%n",
                    date.plusMonths(12).format(formatter));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
