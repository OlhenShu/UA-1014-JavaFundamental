package lesson7.practical;

public abstract class Person {
    String name;
    final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
    }

    abstract void print();
}
