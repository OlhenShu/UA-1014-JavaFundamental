package homework.lesson7.task7_1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdmember;
    private String name;
    private double fixedMonthlyPay;
    public ContractEmployee(String employeeId,String name,String federalTaxIdmember, double fixedMonthlyPay){
        super(employeeId);
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPay = fixedMonthlyPay;
    }
    @Override
    public double calculatePay(){
        return fixedMonthlyPay;
    }

    @Override
    public String toString() {
        return
                super.toString() + "Name - " + name +
                        ", Federal tax id member - " + federalTaxIdmember +
                        ",\nFixed monthly pay - " + fixedMonthlyPay + ".";
    }
}
