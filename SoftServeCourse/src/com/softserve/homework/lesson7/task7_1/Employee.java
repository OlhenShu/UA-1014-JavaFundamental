package homework.lesson7.task7_1;

public abstract class Employee implements Payment {
    private String employeeId;
    public Employee(String employeeId){
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee Id - " + employeeId
                + ":\n";
    }
}
