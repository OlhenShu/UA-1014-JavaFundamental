package practical.lesson5.task5_4;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;
    public Employee(){

    }
    public Employee(String name,int departmentNumber,double salary){
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;

}
    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }
    public double getSalary() {
        return salary;
    }

    public static void inputDepartment(Employee[] workers){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the department number (1-4):");
        int input = scan.nextInt();
        for(int i = 0;i < workers.length;i++){
            if (workers[i].departmentNumber == input){
                System.out.printf("Employees of the department %d - ",input);
                System.out.println(workers[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name is '" + name + '\'' +
                ", departmentNumber is " + departmentNumber +
                ", salary is " + salary +
                "}\n";
    }
}
