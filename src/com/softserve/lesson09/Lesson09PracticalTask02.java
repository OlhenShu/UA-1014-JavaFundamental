package com.softserve.lesson09;

import java.util.HashSet;

public class Lesson09PracticalTask02 {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String[] strings = str.split(", ");
        HashSet<String> hashSet = new HashSet<>();

        for (String s : strings) {
            hashSet.add(s);
        }

        for (String s : hashSet
        ) {
            System.out.println(s);
        }
    }
}
