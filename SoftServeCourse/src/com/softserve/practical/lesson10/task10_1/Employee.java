package practical.lesson10.task10_1;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private DateOfBirth dateOfBirth;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, String position,double salary, DateOfBirth dateOfBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        Scanner scan = new Scanner(System.in);
        this.name = name;
    }


    public DateOfBirth getDateOfBitrh() {
        return dateOfBirth;
    }

    public void setDateOfBitrh(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Employee name: "  + name +
                ", position: " + position +
                ", salary: " + salary +
                ", date of birth=" + dateOfBirth;
    }
}
