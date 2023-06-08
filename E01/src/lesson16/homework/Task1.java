package lesson16.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;


public class Task1 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        String filename = "file1.txt";
        var file = new File(filename);
        try (var bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("""
                    This is information
                    about
                    my career
                     """);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] lines = Files.lines(Path.of(filename))
                .toArray(String[]::new);

        for (var line : lines) {
            count++;
            System.out.println(line);
        }

        var maxLine = Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .get();

        String filename2 = "file2.txt";
        var file2 = new File(filename2);
        try (var bw = new BufferedWriter(new FileWriter(file2))) {
            bw.write("Number of lines in file1.txt: " + count);
            bw.newLine();
            bw.write("Longest line in file1.txt: " + maxLine);
            bw.newLine();
            bw.write("Name: Taras Romanyshyn");
            bw.newLine();
            bw.write("Birthday date: 28/10/87");
            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
