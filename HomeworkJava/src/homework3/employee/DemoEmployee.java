package homework3.employee;
//2. Create class called Employee that should consist of:
//        • three private fields: name, rate and hours;
//        • a static field called totalSum
//        • properties to access these fields;
//        • a default constructor and two constructors with parameters;
//        • Methods:
//        o getSalary() - to calculate the salary of an employee (formula rate * hours);
//        o toString() - to output information about the employee;
//        o getBonuses() – to calculate 10% from salary.
//        In the main() method create 3 objects of type Employee, input information about them.
//        Display the total salary of all employees to the console

public class DemoEmployee {
      public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee.promptParametrs(employee1);

        Employee employee2 = new Employee();
        Employee.promptParametrs(employee2);

        Employee employee3 = new Employee();
        Employee.promptParametrs(employee3);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}




