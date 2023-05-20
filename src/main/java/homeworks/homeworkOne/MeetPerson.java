package homeworks.homeworkOne;
import java.util.Scanner;

public class MeetPerson {
    public static void main(String[] args) {
        meetPerson();
    }

    public static void meetPerson() {

        Scanner scann = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scann.nextLine();
        System.out.println("\nWhere do you live, " + name + "?");
        String adress = scann.nextLine();
        System.out.println("Your name is " + name + " and you are from " + adress + ".");
        scann.close();
    }
}
