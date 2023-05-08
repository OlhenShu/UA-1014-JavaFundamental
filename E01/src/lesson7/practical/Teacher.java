package lesson7.practical;

public class Teacher extends Staff {
    final String TYPE_PERSON = "TEACHER";

    public Teacher(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println(name + ": I am a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("The salary is 45000");
    }
}
