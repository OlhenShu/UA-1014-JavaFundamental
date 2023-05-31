package lesson13.practical;

import java.util.List;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(count(list, i -> i > 5));
    }

    static int count(List<Integer> list, Predicate<Integer> condition) {
        int res = 0;
        for (var el : list) {
            if (condition.test(el)) {
                res++;
            }
        }
        return res;
    }
}
