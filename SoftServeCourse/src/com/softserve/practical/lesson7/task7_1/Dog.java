package practical.lesson7.task7_1;

public class Dog implements Animal{
    @Override
    public void voice(){
        System.out.println("Dog says Woof-Woof");
    }
    @Override
    public void feed(){
        System.out.println("You feed the dog, the dog is happy");
    }
}
