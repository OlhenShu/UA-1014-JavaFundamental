package lesson7.practical;

public abstract class Staff extends Person{

    abstract void salary();

    public Staff(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am a staff");
    }
}
