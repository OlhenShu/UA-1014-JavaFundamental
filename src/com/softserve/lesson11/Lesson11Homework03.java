package com.softserve.lesson11;

import java.util.*;
import java.util.regex.*;

public class Lesson11Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList();
        int countInput = 1;

        list.add("$$$$111111111111111.22222222    $$$$$$33333333.444444");

        for (int i = 0; i < countInput; i++) {
            list.add(scanner.nextLine());
        }

        String pattern = "\\$\\d+\\.+\\d{2}";
        Pattern p = Pattern.compile(pattern);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("String " + (i + 1) + ": ");
            Matcher m = p.matcher(list.get(i));
            while (m.find()) {
                System.out.println(list.get(i).substring(m.start(), m.end()));
            }
        }
    }
}