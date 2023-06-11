package com.softserve.lesson16;

import java.io.*;
import java.nio.file.*;
import java.util.Collections;
import java.util.stream.*;

public class Lesson16Homework02 {
    public static final String text = """
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStreamReader;
                                                
            public class Lesson01Homework02 {
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("What is your name?");
                                                
                    String name = br.readLine();
                    System.out.println("Where do you live, " + name + "?");
                    String address = br.readLine();
                }
            }                                                                                               
            """;

    public static void main(String[] args) throws IOException {
//        File file = new File("file1.txt");
//        Files.writeString(file.toPath(), text);

        Stream<String> lines = Files.lines(Path.of("file1.txt"));
        String str = lines.collect(Collectors.joining("\n"));

        String result = str.replace("public", "private");
        System.out.println(result);

        Files.write(Paths.get("file2.txt"), Collections.singleton(result));
    }
}

