package com.softserve.edu16.IOJavaFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A file with java code is given. Read program text from file and
 * all words public in the declaration of class attributes and
 * methods should be replaced with the word private. Save the result to
 * another previously created file.
 */
public class IOJavaFile {
    public static void main(String[] args) {
        String filePath = "com/softserve/edu16/IOJavaFile/";
        String inputFile = "input.java";
        String outputFile = "output.java";

        try {
            List<String> programText = readProgramTextFromFile(filePath + inputFile);

            List<String> replacedProgramLines = replacePublicWithPrivate(programText);

            saveProgramTextToFile(replacedProgramLines, filePath + outputFile);

            System.out.println("The replacing successfully completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readProgramTextFromFile(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    private static List<String> replacePublicWithPrivate(List<String> lines) {
        return lines.stream()
                .map(line -> line.replaceAll("\\bpublic\\b", "private"))
                .collect(Collectors.toList());
    }

    private static void saveProgramTextToFile(List<String> replacedProgramLines,
                                              String outputFilePath) throws IOException {
        Files.write(Path.of(outputFilePath), replacedProgramLines, StandardOpenOption.CREATE);
    }
}
