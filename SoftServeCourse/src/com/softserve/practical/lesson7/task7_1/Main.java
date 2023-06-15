package practical.lesson7.task7_1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Dog(),
                new Cat(),
        };
        for(Animal animal : animals){
            animal.voice();
             animal.feed();
        }
    }
}
