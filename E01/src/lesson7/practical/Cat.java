package lesson7.practical;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("meow meow");
    }

    @Override
    public void feed() {
        System.out.println("cats like milk and fish");
    }
}
