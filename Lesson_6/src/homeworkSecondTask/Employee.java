package homeworkSecondTask;

public class Employee {
    private final String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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


    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: %.2f", getName(), getAge(), getSalary());
    }
    @Override
    public String toString() {
        return report();
    }
}
