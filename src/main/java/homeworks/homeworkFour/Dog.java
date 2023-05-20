package homeworks.homeworkFour;

public class Dog {
    private String name;
    private int age;
    Breed breed;

    public enum Breed {BULLDOG, DALMATIAN, GERMAN_SHEPHERD, BEAGLE, LABRADOR_RETRIEVER, SIBERIAN_HUSKY;}

    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = checkBreed(breed);
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

    Breed checkBreed(String breed) {
        switch (breed.toLowerCase()) {
            case "bulldog": return Breed.BULLDOG;
            case "dalmatian": return Breed.DALMATIAN;
            case "german shepherd": return Breed.GERMAN_SHEPHERD;
            case "beagle": return Breed.BEAGLE;
            case "labrador retriever": case "labrador": return Breed.LABRADOR_RETRIEVER;
            case "siberian husky": case "husky": return Breed.SIBERIAN_HUSKY;
            default: throw new IllegalArgumentException("Unknown bree: " + breed);
        }
    }

    @Override
    public String toString() {
        return "Dog [name = " + getName() + ", breed = " + getBreed() + ", age = " + getAge() + "]";
    }
}
class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Zeus", "labrador", 2);
        Dog dog2 = new Dog("Amur", "german shepherd", 4);
        Dog dog3 = new Dog("Lord", "bulldog", 8);

        System.out.println(dog1.getName().equals(dog2.getName()));
        System.out.println(dog1.getName().equals(dog3.getName()));
        System.out.println(dog3.getName().equals(dog2.getName()));
        System.out.println(oldestDog(dog1, dog2, dog3) + " is the oldest dog");
    }

    static Dog oldestDog(Dog dog1, Dog dog2, Dog dog3){
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) return dog1;
        if (dog2.getAge() > dog3.getAge()) return dog2;
        return dog3;       
    }
}

