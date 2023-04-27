package lesson4.homework;


enum Breed {
    BULLDOG, BEAGLE, TERRIER
}
public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog ("Alf", Breed.BULLDOG, 3);
        Dog dog2 = new Dog("Bob", Breed.BEAGLE, 4);
        Dog dog3 = new Dog("Claire", Breed.TERRIER, 5);
        if ((dog1.getName() != dog2.getName()) && (dog1.getName() != dog3.getName()) && (dog2.getName() != dog3.getName())) {
            System.out.println("There are no 2 dogs with the same name");
        } else System.out.println("Two or more dogs have same names");
        Dog oldestdog = dog1;
        if (dog2.getAge()>oldestdog.getAge()) {
            oldestdog = dog2;
        }
        if (dog3.getAge()>oldestdog.getAge()) {
            oldestdog = dog3;
        }
        System.out.println("The name of the oldest dog is " + oldestdog.getName());
        System.out.println("The breed of the oldest dog is " + oldestdog.getBreed());
    }
}
