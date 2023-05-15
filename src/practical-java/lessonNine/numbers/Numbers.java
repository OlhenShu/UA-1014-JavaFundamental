package lessonNine.numbers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Numbers {
    public static void main(String[] args) {

        String[] numbers = inputNumbers();
        Set<String> numbersCollection = new HashSet<>();

        for (String number : numbers) {
            numbersCollection.add(number);
        }

        System.out.print("Result: ");
        for (String number : numbersCollection) {
            System.out.print(number + ", ");
        }
    }

    public static String[] inputNumbers() {
        System.out.println("Enter a set of numbers as single string\nExample: '1, 2, 3, 4, 4, 5, 6, 6, 7, 8'");
        System.out.print("Enter: ");
        Scanner scanner = new Scanner(System.in);
        return splitString(scanner);
    }
    
    public static String[] splitString(Scanner scanner) {
        String input = scanner.nextLine();
        scanner.close();
        String[] nums = input.split(", ");
        return nums;
    }
}
