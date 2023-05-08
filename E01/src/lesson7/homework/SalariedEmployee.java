package lesson7.homework;

public class SalariedEmployee extends Employee implements Payment {
    private String name;
    private String socialSecurityNumber;
    double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixed_monthly_payment) {
        super(employeeId);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixed_monthly_payment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
