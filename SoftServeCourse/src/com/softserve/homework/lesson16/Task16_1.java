package homework.lesson16;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Comparator;

public class Task16_1 {
    public static void main(String[] args) throws IOException {
        String fileName = "file1.txt";
        File file1 = new File(fileName);
        String fileName2 = "file2.txt";
        File file2 = new File(fileName2);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1))) {
            bw.write("""
                    My career started at 2018
                    I was a consultant at "Epicentr"
                    Later I was a sales manager at "Ukrenevo"  
                    """);
        } catch (IOException e) {
            System.out.println("File error");
        }
        String[] lines = Files.lines(Path.of(fileName))
                .toArray(String[]::new);
        for (String s : lines) {
            System.out.println(s);
        }
        var maxLine = Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .get();
        int numberOfLines = lines.length;
        try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(fileName2))) {
            bw2.write("Number of lines in file1.txt - " + numberOfLines + "\n");
            bw2.write("The longest line in file1.txt - " + maxLine + "\n");
            bw2.write("""
                    Slipak Roman
                    30.11.1998
                    """);
        }
        String[] lines2 = Files.lines(Path.of(fileName2))
                .toArray(String[]::new);
        for (String s : lines2) {
            System.out.println(s);
        }
    }
}
