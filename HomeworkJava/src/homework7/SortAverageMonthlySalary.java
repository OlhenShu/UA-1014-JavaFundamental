package homework7;

import java.util.Comparator;

class SortAverageMonthlySalary implements Comparator <Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getAverageMonthlySalary(), o1.getAverageMonthlySalary());
    }
}