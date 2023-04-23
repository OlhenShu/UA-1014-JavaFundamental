package practical.practical03.task2;

public class Employee {
    private String name = "Employee";
    private  double rate;
    private int hours;
    public static int count = 0;


    public static void main(String[] args) {
        Employee first = new Employee();
        first.name = "Alise";
        first.hours = 150;
        first.rate = 110;
        Employee second = new Employee("Bob");
        second.hours = 170;
        second.rate = 105;
        Employee third = new Employee(180);
        third.name = "Charles";
        third.rate = 107;

        System.out.println(toString(first));
        System.out.println(toString(second));
        System.out.println(toString(third));
        System.out.println("Total salary of all employees = " + totalSum(first,second,third));
    }

    public Employee(){
        count++;
        this.name = this.name + count;
    }
    public Employee(String name){
        count++;
        this.name = name;
    }
    public Employee(int h){
        count++;
        this.hours = h;
        this.name = this.name + count;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }
    public static String toString(Employee em){
        return "Employee [name = " + em.getName() + ", hours = " + em.getHours() + ", rate = " + em.getRate() +
                ", salary = " + em.getSalary() + ", bonuses = " + em.getBonuses() +"]";
    }
    public double getBonuses(){
        return (this.rate * this.hours) * 0.1;
    }
    public static double totalSum(Employee a, Employee b, Employee c){
        return (a.getSalary()+ a.getBonuses())+(b.getSalary()+ b.getBonuses())+(c.getSalary()+ c.getBonuses());
    }
}
