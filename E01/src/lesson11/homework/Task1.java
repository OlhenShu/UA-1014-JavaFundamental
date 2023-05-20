package lesson11.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Invalid input. Please enter a sentence of  five words.");
        } else {
            String longestWord = words[0];
            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > longestWord.length()) {
                    longestWord = words[i];
                }
            }
            System.out.println("Longest word: " + longestWord);
            System.out.println("The longest word contains " + longestWord.length() + " words");
        }

        String secondWord = words[1];
        StringBuilder reversed = new StringBuilder(secondWord);
        reversed.reverse();
        System.out.println("Second word in reverse: " + reversed.toString());


        scanner.close();
    }
}
