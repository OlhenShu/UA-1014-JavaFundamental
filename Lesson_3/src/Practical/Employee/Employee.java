package Practical.Employee;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate,int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum +=getSalary();
    }

    public double getSalary() {
        return rate*hours;
    }
    public double getBonus() {
        return  totalSum+(getSalary() * 0.1);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
