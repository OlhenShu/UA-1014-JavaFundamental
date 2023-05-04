package homework6;

public class Employee {
    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report(){
        return String.format("Name: %s,\tAge: %d,\tSalary: %.2f.",name,age,salary);
    }
}
