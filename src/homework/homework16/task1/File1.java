package homework.homework16.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Comparator;


public class File1 {
    public static void main(String[] args) {
        String file1name = "src/homework/homework16/task1/file1.txt";
        String file2name = "src/homework/homework16/task1/file2.txt";
        var file2 = new File(file2name);

        try {
            String[] lines = Files.lines(Path.of(file1name)).toArray(String[]::new);
            for (var line : lines) {
                System.out.println(line);
            }
            String text1 = "Number of lines in file1.txt: " + lines.length;
            Files.writeString(file2.toPath(), text1, StandardOpenOption.APPEND);

            var maxLine = Arrays.stream(lines)
                    .max(Comparator.comparing(String::length))
                    .get();
            String text2 ="\nThe longest line in file1.txt: " + maxLine;
            Files.writeString(file2.toPath(), text2, StandardOpenOption.APPEND);
            Files.writeString(file2.toPath(), "\nMaryna Chekhovska 27.09.1995", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
