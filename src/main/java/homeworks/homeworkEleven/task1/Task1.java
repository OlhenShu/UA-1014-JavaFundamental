package homeworks.homeworkEleven.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Input a sentence of five words: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        System.out.println("You entered: " + text);
        String[] textArray = text.split("\\s+");

        String longestWord = getTheLongestWord(textArray);
        System.out.println("The longest word in the sentence: " + longestWord);

        int lettersInLongestWord = longestWord.length();
        System.out.println("The number of letters in the longest word: " + lettersInLongestWord);

        StringBuilder wordInReverseOrder = reverseWord(textArray, 1);
        System.out.println("The second word of the sentence in reverse order: " + wordInReverseOrder);
    }
    
    public static String getTheLongestWord(String[] text) {
        String longestWord = text[0];
        for (String word : text) {
            if (longestWord.length() < word.length()) longestWord = word;
        }
        return longestWord;
    }

    public static StringBuilder reverseWord(String[] text, int indexOfWord) {
        StringBuilder word = new StringBuilder(text[indexOfWord]);
        return word.reverse();
    }
}
    