package lesson10.practical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map <Integer, String> employeeMap = new HashMap<>();
        employeeMap.put( 001, "Alf");
        employeeMap.put( 002, "Bob");
        employeeMap.put( 003, "Claire");
        employeeMap.put( 004, "Dilan");
        employeeMap.put( 005, "Etan");
        employeeMap.put( 006, "Frank");
        employeeMap.put( 007, "James");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();

        if (employeeMap.containsKey(id)) {
            String name = employeeMap.get(id);
            System.out.println("Name: " + name);
        } else {
            System.out.println("ID not found in the employeeMap.");
        }

        scanner.nextLine();

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        if (employeeMap.containsValue(name)) {
            int correspondingId = 0;
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    correspondingId = entry.getKey();
                    break;
                }
            }
            System.out.println("ID: " + correspondingId);
        } else {
            System.out.println("Name not found in the employeeMap.");
        }

        scanner.close();
    }

}
