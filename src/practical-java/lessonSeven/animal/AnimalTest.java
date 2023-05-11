package lessonSeven.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[0] = new Cat();
        animals[0] = new Dog();
        animals[0] = new Cat();

        for (Animal animal : animals) {
            System.out.print("\n" + animal.getClass().getSimpleName() + ": ");
            animal.voice();
            animal.feed();
        }
    }
}
