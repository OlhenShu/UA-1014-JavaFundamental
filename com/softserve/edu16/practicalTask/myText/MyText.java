package com.softserve.edu16.practicalTask.myText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MyText {
    public static File createFile(String path, String fileName) {
        //create directory if it doesn't exist
        File directory = new File(path);
        directory.mkdirs();

        return new File(directory, fileName);
    }

    public static void writeFile(File file, String content) {
        try (var bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] readFileToArray(String file) throws IOException {
        return Files.lines(Path.of(file))
                .toArray(String[]::new);
    }

    public static void printLineLengths(String[] lines) {
        for (String line : lines) {
            System.out.printf("%d : %s%n", line.length(), line);
        }
    }

    public static void printEqualsWord(String[] lines, String word) {
        Arrays.stream(lines)
                .filter(word::equals)
                .forEach(System.out::println);
    }

    static class ArrayStringLength {
        private String[] lines;
        private String minLineText;
        private String maxLineText;
        private IntSummaryStatistics linesIntMap;

        public ArrayStringLength(String[] lines) {
            setLines(lines);
            linesIntMap();
            searchMinMaxLengthLines();
        }

        private void setLines(String[] lines) {
            this.lines = lines;
        }

        private void linesIntMap() {
            this.linesIntMap = Arrays.stream(lines)
                    .mapToInt(String::length)
                    .summaryStatistics();
        }

        private void searchMinMaxLengthLines() {
            int minLength = Integer.MAX_VALUE;
            int maxLength = Integer.MIN_VALUE;

            for (String line : lines) {
                int length = line.length();

                if (length < minLength) {
                    minLength = length;
                    minLineText = line;
                }

                if (length > maxLength) {
                    maxLength = length;
                    maxLineText = line;
                }
            }
        }

        private String getMinLineText() {
            return minLineText;
        }

        private String getMaxLineText() {
            return maxLineText;
        }

        public String shortestLine() {
            return String.format("Shortest line: %s, Length: %d",
                    getMinLineText(), linesIntMap.getMin());
        }

        public String longestLine() {
            return String.format("Longest line: %s, Length: %d",
                    getMaxLineText(), linesIntMap.getMax());
        }
    }
}
