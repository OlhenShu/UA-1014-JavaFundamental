package practical.lesson7.task7_1;

public class Cat implements Animal{
    @Override
    public void voice(){
        System.out.println("Cat says Meow-Meow");
    }
    @Override
    public void feed(){
        System.out.println("You feed the cat, the cat is happy");
    }
}
