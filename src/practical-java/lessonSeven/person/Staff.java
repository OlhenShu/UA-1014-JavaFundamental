package lessonSeven.person;

public abstract class Staff extends Person {
    final public static String TYPE_PERSON = "Staff";

    public Staff(String name) {
        super(name);
    }
    
    public abstract void salary();
}
