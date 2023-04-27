package homework4;

public class Dog {

    private Breed breed;
    private int age;
    private String name;

    Dog(){
        this.age = 5;
        this.name = "Dima";
        this.breed = Breed.COLI;
    }
    Dog(int age, String name, Breed breed){
        this.age = age;
        this.name = name;
        this.breed = breed;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
