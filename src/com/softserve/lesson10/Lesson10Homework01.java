package com.softserve.lesson10;

import java.util.*;

public class Lesson10Homework01 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int countSet1 = 5;
        int countSet2 = 10;

        for (int i = 0; i < countSet1; i++) {
            set1.add(i);
        }

        for (int i = 0; i < countSet2; i++) {
            set2.add(i);
        }

        union(set1, set2);
        intersect(set1, set2);
    }

    public static void union(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> set = new HashSet<>();
        set.addAll(s1);
        set.addAll(s2);
        System.out.println(set);
    }

    public static void intersect(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> set = new HashSet<>();
        for (Integer tmp1 : s1) {
            for (Integer tmp2 : s2) {
                if (tmp1 == tmp2) {
                    set.add(tmp1);
                }
            }
        }
        System.out.println(set);
    }
}