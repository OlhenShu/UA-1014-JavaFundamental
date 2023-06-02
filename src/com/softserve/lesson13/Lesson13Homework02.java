package com.softserve.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson13Homework02 {
    public static void main(String[] args) {
        String data1 = "12.22.22";
        validateDate(data1);

        String data2 = "52.42.22";
        validateDate(data2);

        String data3 = "12.22.22222";
        validateDate(data3);
    }

    static void validateDate(String text) {
        String pattern = "\\d{2}\\.\\d{2}\\.\\d{2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        char[] c = text.toCharArray();

        if (m.matches()) {
            String str1 = String.valueOf(new char[]{c[0], c[1]});
            int value1 = Integer.parseInt(str1);

            String str2 = String.valueOf(new char[]{c[3], c[4]});
            int value2 = Integer.parseInt(str2);

            if (value1 > 0 && value1 <= 12 && value2 > 0 && value2 <= 31) {
                System.out.println("Format");
            } else {
                System.out.println("Incorrect value");
            }
        } else {
            System.out.println("Not format");
        }
    }
}
