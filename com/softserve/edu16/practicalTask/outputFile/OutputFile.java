package com.softserve.edu16.practicalTask.outputFile;

import com.softserve.edu16.practicalTask.myText.MyText;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * Prepare a file with text:
 * 1) find and output to the console all words starting with a vowel.
 * 2) find and output to the console all words for which the last
 * letter of one word matches the first letter of the next word.
 */
public class OutputFile {
    public static void main(String[] args) throws IOException {
        String filePath = "com/softserve/edu16/practicalTask/outputFile/mytext.txt";
        String[] lines = MyText.readFileToArray(filePath);

        System.out.println("Words starting with a vowel:");
        printStartsWithVowel(lines);

        System.out.println("Words with matching first and last letters:");
        printWordsWithMatchingLetters(lines);
    }

    private static void printStartsWithVowel(String[] lines) {
        var vowels = "aeiou";

        Arrays.stream(lines)
                .filter(line -> vowels.contains(line.substring(0, 1)))
                .forEach(System.out::println);
    }

    private static void printWordsWithMatchingLetters(String[] lines) {
        var pattern = Pattern.compile("\\w*(\\w)\\W+(?=\\1\\w*)");

        Arrays.stream(lines)
                .flatMap(line -> pattern.matcher(line).results().map(MatchResult::group))
                .forEach(System.out::println);
    }
}
