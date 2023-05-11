package homeworkSeven.payment;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double ratePerHour;
    private double hoursWorked;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double ratePerHour, double hoursWorked) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.ratePerHour = ratePerHour;
        this. hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return ratePerHour * hoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
}
