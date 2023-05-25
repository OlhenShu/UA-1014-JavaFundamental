package com.softserve.lesson11;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.*;

public class Lesson11Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        String str;

        String pattern = "[a-zA-Z -]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        boolean bl;

        do {
            System.out.print("Input first and last name: ");
            str = scanner.nextLine();
            m = p.matcher(str);
            bl = m.matches();
        } while (!bl);

        String[] arr={"Hi","Hello","Good morning","Good day"};
        int index=random.nextInt(4);

        System.out.printf("%s: %s!",arr[index],str);
    }
}
