package com.lesson3;
public class Employee
{
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;
    private double bonuses;

    public Employee(){
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += this.getSalary();
        bonuses = this.getSalary() * 0.1;
    }

    public String getName()
    {
        return this.name;
    }
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public int getRate() {
        return this.rate;
    }
    public int setRate(int rate) {
        this.rate = rate;
        return this.rate;
    }

    public int getHours() {
        return this.hours;
    }
    public int setHours(int hours)
    {
        this.hours = hours;
        return this.hours;
    }
    public int getSalary()
    {
        return this.rate * this.hours;
    }

    @Override
    public String toString()
    {

        return "Employee [name = " + name + ", rate = " + rate + ", hours = " + hours +
                ", salary = " + getSalary() + ", bonuses = " + getBonuses() + "]";
    }

    public static int getTotalSum()
    {
            return totalSum;
    }

    public double getBonuses(){
            return this.getSalary()*0.1;
    };



}


