package com.softserve.lesson16;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Lesson16Homework01 {
    public static final String text = """
             1) number of lines in file1.txt.
             2) the longest line in file1.txt.
             3) your name and birthday date.
            """;

    public static void main(String[] args) throws IOException {
        String fileName = "file1.txt";
        File file = new File(fileName);
        Files.writeString(file.toPath(), text);

        String[] lines = Files.lines(Path.of(fileName))
                .toArray(String[]::new);

        int count = (int) Arrays.stream(lines).count();
        String str = "Number of lines: " + count + "\n";

        var stat = Arrays.stream(lines)
                .mapToInt(String::length)
                .summaryStatistics();

        var maxLine = Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .get();

        str += "The longest line, size " + stat.getMax() + " : " + maxLine + "\n";
        str += "My name's Zhanna and my birthday 02 Desember\n";

        System.out.println(str);
        String fileName2 = "file2.txt";
        File file2 = new File(fileName2);
        Files.writeString(file2.toPath(), str);
    }
}
