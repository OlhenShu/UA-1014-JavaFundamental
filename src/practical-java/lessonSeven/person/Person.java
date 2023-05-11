package lessonSeven.person;

public abstract class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public void print() {}

    public String getName() {
        return name;
    }
}
