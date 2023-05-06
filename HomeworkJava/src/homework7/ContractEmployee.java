package homework7;

public class  ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private double rate;
    private int workedHours;

    public ContractEmployee(String federalTaxIdmember, String name, int workedHours, double rate) {
        super(federalTaxIdmember, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.workedHours = workedHours;
        this.rate = rate;
    }


    @Override
    public double calculatePay() {
        return  workedHours * rate;
    }
    public double getAverageMonthlySalary() {
        return calculatePay();
    }

}
