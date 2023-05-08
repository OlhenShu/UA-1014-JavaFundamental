package lesson7.practical;

public class Cleaner extends Staff {

    final String TYPE_PERSON = "CLEANER";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println(name + ": I am a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("The salary is 34000");
    }
}
