package com.softserve.edu16.ReadContext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write in to the file2.txt
 * 1) number of lines in file1.txt.
 * 2) the longest line in file1.txt.
 * 3) your name and birthday date.
 */
public class ReadContext {
    public static void main(String[] args) {
        String filePath = "com/softserve/edu16/ReadContext/";
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";

        try {
            List<String> list = readFromFile(filePath + inputFile);

            int numberLines = list.size();
            String longestLine = longestLine(list);
            Map<String, String> keyValueList = parseKeyValue(list);

            String fileData = String.format("""
                            Number of lines in %s: %d,
                            The longest line in %s: %s,
                            My name is: %s, My birthday: %s
                            """,
                    inputFile, numberLines,
                    inputFile, longestLine,
                    keyValueList.get("name"), keyValueList.get("birthday"));
            writeToFile(filePath + outputFile, fileData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readFromFile(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    private static String longestLine(List<String> lines) {
        return lines.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("The file does not contain lines");
    }

    private static void writeToFile(String filePath, String content) throws IOException {
        Files.write(Path.of(filePath), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    private static Map<String, String> parseKeyValue(List<String> lines) {
        Map<String, String> keyValueMap = new HashMap<>();

        for (String line :
                lines) {
            String[] parts = line.split(":");

            if (parts.length == 2) {
                String key = parts[0].toLowerCase().trim();
                String value = parts[1].trim();

                keyValueMap.put(key, value);
            }
        }

        return keyValueMap;
    }
}
