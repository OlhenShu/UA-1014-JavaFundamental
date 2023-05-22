package homework11;

import java.util.Scanner;
public class homeworkTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of the longest word: " + longestWord.length());

        if (words.length > 1) {
            String secondWord = words[1];
            StringBuilder revers = new StringBuilder(secondWord).reverse();
            System.out.println("Reversed second word: " + revers);
        }
        scanner.close();
    }
}
