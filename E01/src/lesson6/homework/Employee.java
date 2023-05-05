package lesson6.homework;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," + " Salary: \u20B4 %.2f.", name, age, salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20B4 %.2f",
                getName(), getAge(), position, getSalary());
    }
}

class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("Alf", 18, 122000);
        Developer developer = new Developer("Bob", 20, 90000, "Junior");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
