package com.softserve.edu10.unionIntersect;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Intersection: " + intersectSet);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.retainAll(set2);
        return union;
    }
}
