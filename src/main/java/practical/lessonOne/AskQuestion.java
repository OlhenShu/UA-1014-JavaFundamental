package practical.lessonOne;
import java.util.Scanner;

public class AskQuestion {
    public static void main(String[] args) {
        askQuestion();
    }

    public static void askQuestion() {

        Scanner scann = new Scanner(System.in);

        System.out.println("How are you?");
        String respond = scann.nextLine();
        System.out.println("\nYou are " + respond + ".");
        scann.close();
    }
}
