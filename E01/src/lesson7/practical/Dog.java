package lesson7.practical;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("bark bark");
    }

    @Override
    public void feed() {
        System.out.println("dogs like meat");
    }
}
