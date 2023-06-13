package practical.lessonThirteen.task3;

import java.util.ArrayList;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Apple");
        strings.add("World");
        strings.add("Java");
        strings.add("Banana");

        System.out.println("List before sorting: ");
        strings.forEach(System.out::println);

        strings.sort(Comparable::compareTo);
        System.out.println("\nList after sorting: ");
        strings.forEach(System.out::println);
    }
}
