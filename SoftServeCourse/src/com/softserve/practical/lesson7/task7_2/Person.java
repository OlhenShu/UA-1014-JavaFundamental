package practical.lesson7.task7_2;

public abstract class Person {
    private String name;
    protected Person(String name){
        this.name = name;
    }
    public abstract void print();
}
