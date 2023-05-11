package homeworkSeven.payment;

public class ContractEmployee extends Employee {
    private String federalTaxIdNumber;
    private double fixedMonthlyRate;

    public ContractEmployee(String employeeId, String name, String federalTaxIdNumber, double fixedMonthlyRate) {
        super(employeeId, name);
        this.federalTaxIdNumber = federalTaxIdNumber;
        this.fixedMonthlyRate = fixedMonthlyRate;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyRate;
    }

    public String getFederalTaxIdNumber() {
        return federalTaxIdNumber;
    }

    public double getFixedMonthlyRate() {
        return fixedMonthlyRate;
    }
}
