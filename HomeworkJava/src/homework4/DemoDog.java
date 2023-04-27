package homework4;
/**Create a class called Dog that has the following fields: name, breed, age.
        •Declare enum for field breed.
        •In main() method create create three instances of type Dog.
        o Check if there are no two dogs with the same name;
        o Output the name and the breed of the oldest dog*/
public class DemoDog {
    public static void main(String[] args){
        Dog dog1 = new Dog(10,"Bim",Breed.LABRADOR);
        System.out.println(dog1);
        Dog dog2 = new Dog(5, "Bim", Breed.POODLE);
        System.out.println(dog2);
        Dog dog3 =  new Dog(1, "Maloy", Breed.COLI);
        System.out.println(dog3);

        int age1 = dog1.getAge();
        int age2 = dog2.getAge();
        int age3 = dog3.getAge();

        int maxAge = age1;
        if  (age2>maxAge) maxAge = age2;
        if  (age3>maxAge) maxAge = age3;
        System.out.println("The oldest dog is " + maxAge + " years old");

        String name1 = dog1.getName();
        String name2 = dog2.getName();
        String name3 = dog3.getName();

        if (name1.equals(name2))System.out.println("Same names " +" "+ name1+ " and " + name2);
        if (name2.equals(name3))System.out.println("Same names " +" "+ name2+ " and " + name3);
        if (name3.equals(name1))System.out.println("Same names " +" "+ name3+ " and " + name1);

    }
}

