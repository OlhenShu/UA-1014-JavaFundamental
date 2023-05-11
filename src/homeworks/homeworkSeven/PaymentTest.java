package homeworkSeven;

import java.util.Arrays;
import java.util.Comparator;

public class PaymentTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("01", "Mathias", "634653", 6350.55);
        employees[1] = new SalariedEmployee("02", "Elias", "523556", 25.3, 165);
        employees[2] = new ContractEmployee("03", "Thomas", "823443", 70825.5);
        employees[3] = new SalariedEmployee("04", "Tobias", "947653", 32, 180);

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee empl : employees) {
            System.out.println("Employee Id: " + empl.getEmployeeId());
            System.out.println("Name: " + empl.getName());
            System.out.println("Average monthly wage: " + empl.calculatePay());
            System.out.println(" ");
        }
    }
}
