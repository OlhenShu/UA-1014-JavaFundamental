package practical.lessonFive;

import java.util.Scanner;

public class Employee {
    private String name;
    private int department;
    private double salary;

    Employee() {};

    Employee(String name, int department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Elias", 2, 6500);
        employees[1] = new Employee("Mathias", 2, 5500);
        employees[2] = new Employee("Thomas", 2, 7500);
        employees[3] = new Employee("Tobias", 2, 4500);
        employees[4] = new Employee("Mark", 2, 8500);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the department number: ");
        int departmentNumber = scanner.nextInt();
        scanner.close();

        System.out.println("\nEmployees of certain department: ");
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                System.out.println(employee.getName());
            }
        }

        Employee temp;
        boolean swap = true;
        System.out.print("Salary in descending order: ");
        while (swap) {
            swap = false;
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].getSalary() < employees[i + 1].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    swap = true;
                }
            }
        }

        for (Employee salary : employees) {
            System.out.print(salary.getSalary() + ", ");
        }
    }
}
