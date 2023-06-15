package homework.lesson7.task7_1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private String name;
    private int hourlyRate;
    private int numberOfHoursWorked;
    public SalariedEmployee(String employeeId,String socialSecurityNumber,String name, int hourlyRate, int numberOfHoursWorked){
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    @Override
    public double calculatePay(){
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return
                super.toString() + "Name - " + name +
                        ", Social security number - " + socialSecurityNumber +
                        ",\nHourly rate - " + hourlyRate +
                        ", Number of hours worked - " + numberOfHoursWorked + ".";
    }
}
