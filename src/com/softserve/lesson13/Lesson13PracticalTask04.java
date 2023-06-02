package com.softserve.lesson13;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Lesson13PracticalTask04 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(count(list, x -> x >= 4));
    }

    static int count(List<Integer> list, IntPredicate condition) {
        int res = 0;
        for (var el : list) {
            if (condition.test(el)) {
                res++;
            }
        }
        return res;
    }
}
