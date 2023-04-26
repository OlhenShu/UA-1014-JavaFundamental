package task4_5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sally",Breed.GERMAN_SHEPHERD,6);
        Dog dog2 = new Dog("Pikachy",Breed.AKITA, 3);
        Dog dog3 = new Dog("Abadon",Breed.BULLDOG,10);
        if (dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)){
            System.out.println("Some dogs have the same names");
        }
        int maxYear = Math.max(Math.max(dog1.getAge(), dog2.getAge()), dog3.getAge());
        if (maxYear == dog1.getAge()){
            System.out.println(dog1.toString());
        }
        else if (maxYear == dog2.getAge()) {
            System.out.println(dog2.toString());
        }
        else {
            System.out.println(dog3.toString());
        }
        }
    }
