package com.softserve.lesson11;

import java.util.Scanner;
import java.util.regex.*;

public class Lesson11Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "[^ ]+";
        String text = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + " ");
        }
    }
}
