package com.softserve.lesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson04Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = 3;
        ArrayList<Float> arrayList = new ArrayList<>();

        for (int i = 0; i < countNumber; i++) {
            arrayList.add(scanner.nextFloat());
        }

        System.out.println("Belong to the range [-5, 5]");

        for (Float fl : arrayList) {
            if (fl >= -5f && fl <= 5) {
                System.out.print(fl + " ");
            }
        }
    }
}
