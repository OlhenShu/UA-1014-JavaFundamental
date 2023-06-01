package lesson14.practical;

import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        var primes = IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var stat = primes.summaryStatistics();
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
        System.out.println(stat.getCount());
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}
