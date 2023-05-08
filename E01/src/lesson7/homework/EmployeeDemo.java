package lesson7.homework;

import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("A123", "Alf", "11-22-33", 5500));
        employees.add(new ContractEmployee("B234", "Bob", "111-222", 30.0, 160));
        employees.add(new ContractEmployee("C345", "Claire", "333-555", 35, 145));
        employees.add(new SalariedEmployee("D456", "Dilan", "12-23-34", 4600));

        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                double pay1 = e1 instanceof Payment ? ((Payment) e1).calculatePay() : 0;
                double pay2 = e2 instanceof Payment ? ((Payment) e2).calculatePay() : 0;
                return Double.compare(pay2, pay1);
            }
        });

        for (Employee e : employees) {
            System.out.println("Employee ID: " + e.getEmployeeId() + ", Name: " + e.getName() + ", Average Monthly Wage: $" + ((Payment) e).calculatePay());
        }
    }
}

