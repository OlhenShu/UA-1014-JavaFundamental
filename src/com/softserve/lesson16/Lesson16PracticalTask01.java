package com.softserve.lesson16;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Lesson16PracticalTask01 {
    public static void main(String[] args) throws IOException {
        String fileName = "text.txt";
        File file = new File(fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("""
                    line 1
                    line 2
                    var
                    line 4
                    var
                    """);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        String[] lines = Files.lines(Path.of(fileName))
                .toArray(String[]::new);

        for (String str : lines) {
            System.out.println(str);
        }

        var stat = Arrays.stream(lines)
                .mapToInt(String::length)
                .summaryStatistics();

        var minLine = Arrays.stream(lines)
                .min(Comparator.comparing(String::length))
                .get();

        var maxLine = Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println("min " + stat.getMin() + " : " + minLine);
        System.out.println("max " + stat.getMax() + " : " + maxLine);

        Arrays.stream(lines)
                .filter("var"::equals)
                .forEach(System.out::println);
    }
}
