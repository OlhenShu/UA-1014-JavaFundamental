package lesson16.practical;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String filename = "text2.txt";
        var file = new File(filename);
        try (var bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("""
                    Avocado banana
                    Coconut fig
                    Grapefruit melon
                    Kiwi apple
                    Lemon nectarine
                    """);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] lines = Files.lines(Path.of(filename))
                .toArray(String[]::new);


        var vowels = "AEIOUYaeiouy";
        Arrays.stream(lines)
                .filter(line ->
                        vowels.contains(line.substring(0, 1)))
                .forEach(System.out::println);

        var p = Pattern.compile("\\w*(\\w)\\W+\\1\\w*");
        Arrays.stream(lines)
                .flatMap(line -> p.matcher(line).results().map(MatchResult::group))
                .forEach(System.out::println);

    }
}
