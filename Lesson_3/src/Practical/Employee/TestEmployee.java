package Practical.Employee;


public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Roman", 20, 8);
        Employee e2 = new Employee("Iryna", 22, 8);
        Employee e3 = new Employee("Ivan", 20, 10);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("The salary first employee is " + e1.getSalary());
        System.out.println("The salary second employee is " + e2.getBonus());
        System.out.println("The salary third employee is " + e3.getSalary());
    }
}

