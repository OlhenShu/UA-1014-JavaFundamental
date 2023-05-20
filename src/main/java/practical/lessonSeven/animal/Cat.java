package practical.lessonSeven.animal;

public class Cat implements Animal{
    
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat");
    }
}
