package lesson7.practical;

public class Student extends Person {
    final String TYPE_PERSON = "STUDENT";

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println(name + ": I am a " + TYPE_PERSON);
    }
}
