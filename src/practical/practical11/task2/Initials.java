package practical.practical11.task2;

import java.util.Scanner;

public class Initials {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter your fool name: ");
        String firstName = sc.nextLine();
        String middleName = sc.nextLine();
        String lastName = sc.nextLine();
        System.out.printf("%s %c. %c.%n", lastName, middleName.charAt(0), firstName.charAt(0));
        System.out.println(firstName);
        System.out.format("%s %s %s", firstName, middleName, lastName);

    }
}
