package com.softserve.lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lesson04Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = 3;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < countNumber; i++) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println("Max = " + Collections.max(arrayList));
        System.out.println("Min = " + Collections.min(arrayList));
    }
}
