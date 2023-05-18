package com.softserve.edu10.practicalTask;

import java.util.*;

public class EmployeeMap {
    private static final HashMap<Integer, Employee> employeeMap = new HashMap<>();

    public static void populateEmployeeMap() {
        addEmployee(1, "Ann");
        addEmployee(2, "Ben");
        addEmployee(3, "Emily");
        addEmployee(4, "Luisa");
        addEmployee(5, "Lukas");
        addEmployee(6, "Ivan");
        addEmployee(7, "Jen");
    }

    /**
     * Before adding ID-name pairs to the map, it is recommended to perform a check for
     * duplicate values. If duplicates are found, the user should be notified and the addition of data
     * to the map should be halted.
     */
    private static void addEmployee(int id, String name) {
        if (employeeMap.containsKey(id)) {
            System.out.printf("Duplicate ID %d found. Data addition halted.%n", id);
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter details for Employee ID " + id);

        System.out.print("Position: ");
        String position = input.next();

        System.out.print("Salary: ");
        double salary = input.nextDouble();

        System.out.print("Date of Birth: ");
        String dateOfBirth = input.next();

        Employee employee = new Employee(name, position, salary, dateOfBirth);

        if (employeeMap.containsValue(employee)) {
            System.out.printf("Duplicate data found.%n");
            return;
        }

        employeeMap.put(id, employee);
    }

    public static void displayEmployeeMap() {
        System.out.println(employeeMap);
    }

    public static void findNameById() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter user ID to find the corresponding name: ");
        int id = input.nextInt();

        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.get(id);
            System.out.printf("User with ID %d found, their name: %s.%n", id, employee.getName());
        } else {
            System.out.printf("User with ID %d not found.%n", id);
        }
    }

    public static void findIdByName() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter user name to find the corresponding ID: ");
        String name = input.next();

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            int id = entry.getKey();
            Employee employee = entry.getValue();

            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.printf("User with name %s found, his ID: %s.%n", name, id);
                return;
            }
        }

        System.out.printf("User with name %s not found.%n", name);
    }

    public static void updateEmployeeData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ID of the employee to update: ");
        int id = input.nextInt();

        if (!employeeMap.containsKey(id)) {
            System.out.printf("User with ID %d not found.%n", id);
            return; //or recursion updateEmployeeData();
        }

        input.nextLine(); // new line fix

        System.out.print("Enter the new name: ");
        String name = input.nextLine();

        System.out.print("Enter the new position: ");
        String position = input.nextLine();

        System.out.print("Enter the new salary: ");
        double salary;
        while (!input.hasNextDouble()) {
            System.out.println("Invalid field. Please enter an double number.");
            input.nextLine(); // Clear the input buffer
        }
        salary = input.nextDouble();

        input.nextLine(); // new line fix

        Employee employee = employeeMap.get(id);
        employee.setName(name);
        employee.setPosition(position);
        employee.setSalary(salary);
        System.out.println("Employee data updated successfully.");
    }

    public static void sortingEmployees() {
        List<Map.Entry<Integer, Employee>> sortedList = new ArrayList<>(employeeMap.entrySet());

        Scanner input = new Scanner(System.in);
        System.out.print("Select sorting criteria [id, name, position]: ");

        switch (input.nextLine().toLowerCase()) {
            case "id" -> sortedList.sort(Map.Entry.comparingByKey());
            case "name" -> sortedList.sort(Comparator.comparing(e -> e.getValue().getName()));
            case "position" -> sortedList.sort(Comparator.comparing(e -> e.getValue().getPosition()));
            default -> System.out.println("Invalid sort criterion. Displaying unsorted map.");
        }
    }
}
