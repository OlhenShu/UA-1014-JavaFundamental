package homework.homework11.task2;

import java.util.Scanner;

public class Changes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence with consecutive spaces: ");

        String sentence = sc.nextLine();
        System.out.println(sentence.replace("  ", " "));

    }
}
