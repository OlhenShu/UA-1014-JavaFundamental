package Practical;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var empArr = initEmployeeArray();

        System.out.println("Enter department number: ");
        int numberOfDepartment = sc.nextInt();
        showEmployeeList(empArr, numberOfDepartment);
        sortEmployee(empArr);

    }

    private static void showEmployeeList(Employee[] empArr, int numberOfDepartment) {
        System.out.println("employees of this department " + numberOfDepartment + ":");
        for (Employee em : empArr) {
            if (em.getDepartmentNumber() == numberOfDepartment) {
                System.out.println(em);
            }
        }
    }

    private static void sortEmployee(Employee[] empArr) {
        int n = empArr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (empArr[i - 1].getSalary() < empArr[i].getSalary()) {
                    Employee temp = empArr[i - 1];
                    empArr[i - 1] = empArr[i];
                    empArr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        System.out.println("---------------------------");
        for (Employee employee : empArr) {
            System.out.println(employee);
        }
    }


    private static Employee[] initEmployeeArray() {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Roman", 2, 100);
        empArr[1] = new Employee("Iryna", 2, 200);
        empArr[2] = new Employee("Olga", 2, 300);
        empArr[3] = new Employee("Oleksandr", 4, 400);
        empArr[4] = new Employee("Daria", 5, 500);
        return empArr;
    }
}
