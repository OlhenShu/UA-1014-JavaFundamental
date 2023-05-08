package practical.lesson7.task7_2;

public abstract class Staff extends Person {
    private double salary;
    protected Staff(String name,double salary){
        super(name);
        this.salary = salary;
    }
    public abstract void salary();

    protected double getSalary() {
        return salary;
    }
}
