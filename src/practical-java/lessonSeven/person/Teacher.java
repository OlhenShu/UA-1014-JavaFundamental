package lessonSeven.person;

public class Teacher extends Staff {
    final public static String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ": " + getName());
    }
    
    @Override
    public void salary() {
        System.out.println("Salary of " + TYPE_PERSON + ": " + getName());
    }
}
