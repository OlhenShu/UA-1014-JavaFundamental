package com.softserve.lesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson04PracticalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = 3;
        int result = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < countNumber; i++) {
            System.out.print("Input number = ");
            arrayList.add(scanner.nextInt());
        }

        for (Integer i : arrayList) {
            if (i % 2 != 0) {
                result++;
            }
        }
        System.out.println("Result = " + result);
    }
}
