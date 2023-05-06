package homework7;

public abstract class Employee {
    private String employeeId;
    private String name;

    private double averageMonthlySalary;

    public Employee(String employeeId, String name) {
       this.employeeId = employeeId;
       this.name = name;
       this.averageMonthlySalary = 0;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String getName() {
        return name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", averageMonthlySalary=" + averageMonthlySalary  +

                '}';
    }
}
