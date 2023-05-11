package lessonSeven.person;

public class Student extends Person {
    final public static String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ": " + getName());
    }
}
