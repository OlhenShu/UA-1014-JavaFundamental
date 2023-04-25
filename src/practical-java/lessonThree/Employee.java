package lessonThree;

public class Employee {

    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.totalSum += getSalary();
    }

    public String getName() {
        return this.name;
    }

    public double getRate() {
        return this.rate;
    }

    public double getHours() {
        return this.hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public double getSalary() {
    return this.rate * this.hours;
    }
    
    @Override
    public String toString() {
        return "Employee [name = " + name + ", rate = " + rate + ", hours = " + hours + "]";
    }

    public double getBonuses() {
        return getSalary() * 0.10;
    }

}

class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("Elias", 22, 165);
        Employee employeeTwo = new Employee("Mathias", 15, 165);
        Employee employeeThree = new Employee("Thomas", 12, 165);

        System.out.println("The total salary of all employees: " + Employee.totalSum);
    }
}