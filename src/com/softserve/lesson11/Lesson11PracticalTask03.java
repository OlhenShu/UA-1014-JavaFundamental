package com.softserve.lesson11;

import java.util.Scanner;
import java.util.regex.*;

public class Lesson11PracticalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        for (int i = 0; i < 5; i++) {
            str = scanner.nextLine();
            System.out.println(checkWithRegExp(str));
        }
    }

    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}
