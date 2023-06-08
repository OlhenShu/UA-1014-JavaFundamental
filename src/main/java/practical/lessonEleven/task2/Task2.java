package practical.lessonEleven.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter a first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter a middle name: ");
        String middleName = scanner.nextLine();
        scanner.close();

        System.out.println(lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}



 