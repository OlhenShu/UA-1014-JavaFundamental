package practical.lessonTen.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(001, "Tobias");
        employeeMap.put(002, "Mathias");
        employeeMap.put(003, "Elias");
        employeeMap.put(004, "Augustin");
        employeeMap.put(005, "Thomas");
        employeeMap.put(006, "Octavian");
        employeeMap.put(007, "Niko");

        Scanner scanner = new Scanner(System.in);

        poromptUserToEnterId("Enter the id: ", scanner, employeeMap);
        promptUserToEnterName("Enter the name: ", scanner, employeeMap);
        scanner.close();

    }

    public static void poromptUserToEnterId(String prompt, Scanner scanner, Map<Integer, String> list) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("The id must be an interger: ");
            scanner.next();
        }
        int input = scanner.nextInt();
        if (list.containsKey(input)) {
            System.out.println(list.get(input));
        } else {
            System.out.println("Such id not found");
        }
    }

    public static void promptUserToEnterName(String prompt, Scanner scanner, Map<Integer, String> list) {
        System.out.print(prompt);
        scanner.nextLine();
        String input = scanner.nextLine();
        Integer keyFound = null;
        for (Integer key : list.keySet()) {
            if (list.get(key).equals(input)) {
                keyFound = key;
                break;
            }
        }
        if (keyFound != null) {
            System.out.println("Key for value " + input + ": " + keyFound);
        } else {
            System.out.println("Such value not found");
        }
    }
}