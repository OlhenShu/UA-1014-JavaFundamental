package homework6;

public class  Developer extends Employee {
    private String developer;

    public Developer(String name, int age, double salary, String developer) {
        super(name, age, salary);
        this.developer = developer;
    }

    public String report(){
        return String.format("Name: %s,\tAge: %d,\tSalary: %.2f.\tDeveloper: %s ",getName(),getAge(),getSalary(),developer);
    }

}
