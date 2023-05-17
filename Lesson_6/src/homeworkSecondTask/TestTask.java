package homeworkSecondTask;

import java.util.Arrays;

public class TestTask {
    public static void main(String[] args) {
        var employee =new Employee("roman",20,300.49);
        var developer= new Developer("Oleg",22,4000,"Average Java developer");
        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
