package homeworks.homeworkEleven.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        if (sentence.isEmpty()) {
            System.out.println("Sentence can not be empty");
            return;
        } 

        System.out.println("You have entered: " + sentence);
        String newSentence = replaceConsecutiveSpacesToSingleSpace(sentence);
        System.out.println("After replacing all consecutive spaces with a single space: " + newSentence);

    }

    public static String replaceConsecutiveSpacesToSingleSpace(String sentence) {
        return sentence.replaceAll("\\s+", " ");
    }
}
