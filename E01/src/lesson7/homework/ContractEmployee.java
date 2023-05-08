package lesson7.homework;

public class ContractEmployee extends Employee implements Payment{
    private String name;
    private String federalTaxIdmember;
    private double hourlyRate;
    private int numberOfHoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hourlyRate, int numberOfHoursWorked) {
        super(employeeId);
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*numberOfHoursWorked;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getFederalTaxId() {
        return federalTaxIdmember;
    }

}
