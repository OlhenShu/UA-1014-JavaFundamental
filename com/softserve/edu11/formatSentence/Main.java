package com.softserve.edu11.formatSentence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FormatSentence sentence = new FormatSentence(input.nextLine());
        input.close();

        System.out.printf("The longest word in the sentence: %s%n",
                sentence.getLongestWord());
        System.out.printf("The number of letters in the longest word: %d%n",
                sentence.getLongestWordLength());

        System.out.println("The second word of the sentence in reverse order:");
        String[] words = sentence.getWords();

        if (words.length >= 2) {
            System.out.println(FormatSentence.reverseWord(words[1]));
        } else {
            System.out.println("Sentence contains less than two words");
        }
    }
}
