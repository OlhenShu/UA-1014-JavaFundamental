package lesson7.practical;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal [] animals = {
                new Cat (),
                new Dog(),
        };
        for (var animal : animals) {
            animal.voice();
            animal.feed();

        }
    }
}
