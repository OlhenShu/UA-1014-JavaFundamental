package homework7;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String socialSecurityNumber, String name, double fixedMonthlyPayment) {
        super(socialSecurityNumber, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
    public double getAverageMonthlySalary() {
        return calculatePay();
    }

}

