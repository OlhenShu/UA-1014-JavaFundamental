package homework.homework11.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence of five words: ");

        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        if (words.length == 5){
            //Identify the longest word in the sentence and display it on the console
            String longWord = longerWord(words);
            System.out.println(longWord);
            //Determine the number of letters in the longest word
            System.out.println(longWord.length());
            //Display the second word of the sentence in reverse order on the console
            System.out.println(new StringBuilder(words[1]).reverse());
        }if (words.length > 5) {
            System.out.println("Your sentence has more than five words.");
        }if (words.length < 5) {
            System.out.println("Your sentence has less than five words.");
        }
        System.out.println(words.length);

    }

    public static String longerWord(String[] words){
        String longWord = "";
        for (var word : words){
            if (longWord.length() < word.length()){
                longWord = word;
            }
        }
        return longWord;
    }
}
