package com.softserve.edu07.payment;

public class ContractEmployee extends Employee implements Payment {
    private String name;
    private String FederalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String FederalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId);
        setName(name);
        setFederalTaxIdMember(FederalTaxIdMember);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalTaxIdMember() {
        return FederalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        FederalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
