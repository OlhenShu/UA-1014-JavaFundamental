package homework3.employee;

import java.util.Scanner;

public class Employee{
    private double totalSum;
    private double bonuses;
    static private double totalSalary;
    private String name;
    static public final Scanner SCANNER = new Scanner(System.in);


    private int rate;
    private int hours;

    public Employee(){
        this("N/a" , 0,0);
    }
    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public static void promptParametrs(Employee employee) {
        System.out.println("Input Name");
        String name = SCANNER.nextLine();
        employee.setName(name);
        System.out.println("Input rate for Employee " + employee.getName() + ":" );
        int rate = SCANNER.nextInt();
        employee.setRate(rate);
        System.out.println("Input hours for Employee " + employee.getName() + ":");
        int hours = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setHours(hours);
        employee.totalSum = employee.getHours() * employee.getRate();
        employee.bonuses = employee.totalSum * 10 / 100 ;
        totalSalary += employee.totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", bonuses=" + bonuses +
                ", totalSum=" + totalSum+
                ",totalSalary=" + totalSalary+
                '}';
    }
    public static double getTotalSalary() {
        return totalSalary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

}



