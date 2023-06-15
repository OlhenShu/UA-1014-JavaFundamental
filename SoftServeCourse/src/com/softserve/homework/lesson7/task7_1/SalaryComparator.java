package homework.lesson7.task7_1;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.calculatePay(),o1.calculatePay());
    }
}
