package com.softserve.edu13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * Create a method to validate a date according to the format "mm.dd.yy".
 */
public class DateValidator {
    public static void main(String[] args) {
        String date = "05.18.23";
        String date2 = "33.33.23";

        System.out.printf("Date %s is %b%n", date, validateDate(date));
        System.out.printf("Date %s is %b%n", date2, validateDate(date2));
    }

    public static boolean validateDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm.dd.yy");
        dateFormat.setLenient(false); // set strict parsing

        try {
            dateFormat.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    // alternative, but it doesn't check the number of days in month
    private static boolean validateFormat(String date) {
        return Pattern.matches("^(0[1-9]|1[0-2])\\.(0[1-9]|1\\d|2\\d|3[01])\\.\\d{2}$", date);
    }
}
