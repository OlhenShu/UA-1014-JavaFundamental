package homework6;

public class EmployeeHw6 {
    public static void main(String[] args){
        Employee employee = new Employee("John", 35, 37000.50);
        Developer developer = new Developer("Sara", 30,35000.55,"Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());

    }

}
