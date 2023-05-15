package lesson9.practical;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a set of numbers separated by commas:");
        String input = scanner.nextLine();

        String[] numbersStr = input.split(",");
        List<Integer> numbers = new ArrayList<>();
        for (String str : numbersStr) {
            numbers.add(Integer.parseInt(str.trim()));
        }

        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        System.out.print("Result: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
