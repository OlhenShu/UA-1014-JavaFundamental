package practical.lesson5.task5_4;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Andriy", 2, 2300),
                new Employee("Roman", 1, 2250),
                new Employee("Oleg", 4, 2100),
                new Employee("Olena", 1, 2350),
                new Employee("Natali", 3, 2400)
        };
        Employee.inputDepartment(employees);
        for(int i = 0;i < employees.length;i++){
            for (int j = i + 1;j < employees.length;j++){
                Employee tmp = new Employee();
                if(employees[i].getSalary() < employees[j].getSalary()){
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(employees));
    }

}
