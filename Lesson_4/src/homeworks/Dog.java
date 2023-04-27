package homeworks;

public class Dog {

    private String name;
    private  static breed breed;
    private int age;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Dog.breed getBreed() {return breed;}

    public void setBreed(Dog.breed breed) {this.breed = breed;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age ;
    }

    public Dog(String name, breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    enum breed{
        Corgi,
        Dachshund,
        Labrador;

    }


    public static void main(String[] args) {
        Dog dog1=new Dog("Iryna", Dog.breed.Corgi,20);
        Dog dog2=new Dog("Daria", Dog.breed.Dachshund,19);
        Dog dog3=new Dog("Roman", Dog.breed.Labrador,18);

        if (dog1.name == dog2.name) {
            System.out.println("First and Second dogs have the same names");
        } else if (dog1.name==dog3.name) {
            System.out.println("First and third dogs have the same names");
        } else if (dog2.name==dog3.name) {
            System.out.println("Second and third dogs have the same names");
        }else {
            System.out.println("no similar names");
        }

        if (dog1.age >= dog2.age && dog1.age>= dog3.age) {
            System.out.println(" the oldest dog is "+dog1 +" "+ Dog.breed.Corgi);
        } else if (dog2.age >= dog1.age && dog2.age>= dog3.age) {
            System.out.println(" the oldest dog is "+dog2 +" "+Dog.breed.Dachshund);
        }else {
            System.out.println(" the oldest dog is "+dog3+" "+ Dog.breed.Labrador);
        }
    }

}