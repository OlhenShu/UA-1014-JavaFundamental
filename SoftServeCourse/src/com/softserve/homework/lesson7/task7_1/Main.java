package homework.lesson7.task7_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("5","Lana","923-23-114",1890),
                new ContractEmployee("10","Anton","956-47-889",2050),
                new SalariedEmployee("12","690-11-934","Angela",10,200),
                new ContractEmployee("26","Migel","978-55-767",1950),
                new SalariedEmployee("66","76-234-112","Mike",12,190),
        };
        Arrays.sort(employees, new SalaryComparator());
        for(var employee : employees){
            System.out.println(employee);
        }
    }
}

