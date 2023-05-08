package lesson7.homework;

public abstract class Employee {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public abstract String getName();
}
