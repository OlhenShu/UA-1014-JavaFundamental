package homeworkFive;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        sumNumbers();
    }

    public static void sumNumbers() {
        boolean keepTheProgramm = true;
        Scanner scanner = new Scanner(System.in);

        do {
            int number1 = readInt(scanner, "Number 1: ");
            int number2 = readInt(scanner, "Number 2: ");
            int sum = number1 + number2;
            System.out.println("Sum of " + number1 + " and " + number2 + " equals: " + sum);

            keepTheProgramm = shouldContinue(scanner);
        } while (keepTheProgramm);
        scanner.close();
    }

    public static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Please enter an integer");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static boolean shouldContinue(Scanner scanner) {
        boolean valid;
        System.out.println("Do you want to continue?");
        System.out.println("Enter 'yes'\t'no'");

        scanner.nextLine();
        do {
            String keep = scanner.nextLine().toLowerCase();
            
            switch (keep) {
                case "yes": {
                    System.out.println("Let's continue");
                    valid = true;
                    return true;
                }
                case "no": {
                    System.out.println("See you next time");
                    valid = true;
                    return false;
                }
                default: {
                    System.out.println("Unknown response. Enter 'yes' or 'no'");
                    valid = false;
                }
            } 
        } while (!valid);

        return false;
    }
}
