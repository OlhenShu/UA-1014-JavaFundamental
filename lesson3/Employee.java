package com.lesson3;
public class Employee
{
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;
    private double bonuses;

        public Employee(String name, int rate, int hours)
        {
            this.name = name;
            this.rate = rate;
            this.hours = hours;
            totalSum += this.getSalary();
            bonuses = this.getSalary() * 0.1;
        }

    public String getName()
    {
        return this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getRate()
    {
        return this.rate = rate;
    }
    public void setRate(int rate)
    {
        this.rate = rate;
    }

    public int getHours()
    {
        return this.hours = hours;
    }
    public void setHours(int hours)
    {
        this.hours = hours;
    }
    public int getSalary()
    {
        return rate * hours;
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
            return bonuses;
    };



}


