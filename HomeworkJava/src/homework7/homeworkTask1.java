package homework7;

import java.util.Arrays;

public class homeworkTask1 {
    public static void main(String[] args){
        Employee[] employees = {

                new SalariedEmployee("333", "Sergey", 1000),
                new SalariedEmployee("21 ", "Ivan", 2000),
                new ContractEmployee("235", "Vova", 40, 13),
                new ContractEmployee("223", "Alex", 40, 14)
        };
        Arrays.sort(employees,new SortAverageMonthlySalary());

        for (Employee employee : employees){
            employee.setAverageMonthlySalary(employee.getAverageMonthlySalary());
            System.out.println(employee);

        }
    }
}
