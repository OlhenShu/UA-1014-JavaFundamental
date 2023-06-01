package lesson14.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        var countEmpty = list.stream().filter(String::isEmpty).count();
        System.out.println(countEmpty);

        var nonEmptyStrings = list.stream()
                .filter(not(String::isEmpty))
                .toList();
        System.out.println(nonEmptyStrings);

        var commaSeparatedStrings = list.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.joining(","));
        System.out.println(commaSeparatedStrings);
    }
}
