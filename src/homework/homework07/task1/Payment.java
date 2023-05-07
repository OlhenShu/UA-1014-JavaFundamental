package homework.homework07.task1;

import java.util.Arrays;
import java.util.Comparator;

public interface Payment {
    int calculatePay();
}
abstract class Employee {
    String employeeld;
}

class SalariedEmployee extends Employee implements Payment{
    String socialSecurityNumber;
    int fixedMonthlyPayment;

    SalariedEmployee(String name, String socialSecurityNumber, int fixedMonthlyPayment){
        this.employeeld = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    @Override
    public int calculatePay(){
        return this.fixedMonthlyPayment;
    }
}
class ContractEmployee extends Employee implements Payment {
    String federalTaxIdmember;
    int hourlyRate;
    int numberOfHoursWorked;

    ContractEmployee(String name, String federalTaxIdmember, int hourlyRate, int numberOfHoursWorked){
        this.employeeld = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    @Override
    public int calculatePay(){
        return (this.hourlyRate * this.numberOfHoursWorked);
    }
}
class ArrEmployee {
    public static void main(String[] args){
        Payment[] arrEmployee = {
                new ContractEmployee("Bob", "5421833", 100, 17),
                new ContractEmployee("Emma", "8421762", 120, 16),
                new SalariedEmployee("David","8484563", 1800),
                new SalariedEmployee("Anna", "4412875", 1500),
        };
        Arrays.sort(arrEmployee, new PaymentComparator());
        for(Payment employee: arrEmployee){
            if(employee instanceof ContractEmployee ce){
                System.out.println("My ID is " + ce.federalTaxIdmember + ", my name is " + ce.employeeld +
                        " and my salary is " + ce.calculatePay() + ".");
            }
            if(employee instanceof  SalariedEmployee se){
                System.out.println("My ID is " + se.socialSecurityNumber + ", my name is " + se.employeeld+
                        " and my salary is " + se.calculatePay() + ".");
            }
        }
    }
}

class PaymentComparator implements Comparator<Payment>{
    @Override
    public int compare(Payment o1, Payment o2) {
        return Integer.compare(o1.calculatePay(), o2.calculatePay());
    }
}