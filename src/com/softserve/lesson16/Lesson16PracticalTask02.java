package com.softserve.lesson16;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.regex.*;

public class Lesson16PracticalTask02 {

    public static final String text1 = """
            line 1
            abc cde fhg xyz zyx
            var
            xyz zyx abc cba
            oline 
            var
            """;

    public static void main(String[] args) throws IOException {
        String fileName = "text1.txt";
        File file = new File(fileName);
        Files.writeString(file.toPath(), text1);

        String[] lines = Files.lines(Path.of(fileName))
                .toArray(String[]::new);

        for (String str : lines) {
            System.out.println(str);
        }

        System.out.println(" Words starting with a vowel");
        String vowels = "aoieyu";
        Arrays.stream(lines)
                .filter(line -> vowels.contains(line.substring(0, 1)))
                .forEach(System.out::println);

        System.out.println("Words for which the last letter of one word matches the first letter of the next word");


        var p = Pattern.compile("\\w*(\\w)\\W+\\1\\w*");
        Arrays.stream(lines)
                .flatMap(line -> p.matcher(line)
                        .results().map(MatchResult::group))
                .forEach(System.out::println);
    }
}
