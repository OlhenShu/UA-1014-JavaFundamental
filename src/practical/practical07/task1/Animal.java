package practical.practical07.task1;

public interface Animal {
    void voice();
    void feed();
}
class Cat implements Animal{

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("I'm full, thanks!");
    }
}

class Dog implements Animal{

    @Override
    public void voice() {
        System.out.println("Haw!");
    }

    @Override
    public void feed() {
        System.out.println("I'm full, thanks!");
    }
}
class Animals{
    public static void main(String[] args){
        Animal[] animals = {
                new Cat(),
                new Dog(),
        };
        for (Animal animal: animals){
            if (animal instanceof Cat cat){
                cat.voice();
                cat.feed();
            }
            if( animal instanceof Dog dog){
                dog.voice();
                dog.feed();
            }
        }
    }
}