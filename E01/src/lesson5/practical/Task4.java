package lesson5.practical;

import java.util.Scanner;

class Employee {
    private String name;
    private int department_number;
    private double salary;

    public Employee(String name, int department_number, double salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public double getSalary() {
        return salary;
    }

}

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new  Employee[5];
        employees[0] = new Employee("Alf", 007, 4300);
        employees[1] = new Employee("Bob", 013, 2500);
        employees [2] = new Employee("Claire", 017, 3300);
        employees [3] = new Employee("Dilan", 021, 2300);
        employees [4] = new Employee("Eve", 030, 1500);

        System.out.println("Enter the department number");
        int num = scanner.nextInt();

        for (int i=0; i<employees.length; i++) {
            if (employees[i].getDepartment_number() == num) {
                System.out.println(employees[i].getName() + " works in this department");
            }
        }



        scanner.close();
    }
}
