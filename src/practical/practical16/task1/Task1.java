package practical.practical16.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        String filename = "text.txt";
        var file = new File(filename);
        try (var bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("""
                    something 1
                    something var 2
                    var 3
                    """);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String[] lines = Files.lines(Path.of(filename)).toArray(String[]::new);
            for (var line : lines) {
                System.out.println(line.length() + " : " + line);
            }
            /*String text = Files.readString(Path.of(filename));
            System.out.println(text);*/
            /*var stat = Arrays.stream(lines)
                    .mapToInt(String::length)
                    .summaryStatistics();
            System.out.println(stat.getMin());
            System.out.println(stat.getMax());*/
            var minLine = Arrays.stream(lines)
                    .min(Comparator.comparing(String::length))
                    .get();
            var maxLine = Arrays.stream(lines)
                    .max(Comparator.comparing(String::length))
                    .get();
            System.out.println(minLine);
            System.out.println(maxLine);
            Arrays.stream(lines).filter("var"::equals).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
