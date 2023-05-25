package com.softserve.lesson11;

import java.util.Scanner;

public class Lesson11Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int max = arr[0].length();
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                index = i;
            }
        }

        System.out.println("Max word: " + arr[index]);
        System.out.println("Length: " + arr[index].length());

        StringBuffer strBuffer = new StringBuffer(arr[1]);
        strBuffer.reverse();
        System.out.println(strBuffer.toString());
    }
}
