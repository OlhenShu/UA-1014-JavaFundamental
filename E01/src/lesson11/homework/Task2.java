package lesson11.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String sentence1 = sentence.replaceAll("\\s+", " ");

        System.out.println("Sentence without spaces: " + sentence1);

        scanner.close();
    }
}
