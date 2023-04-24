package lesson3.homework;


import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return 2023 - this.birthYear;
    }

    public static void input(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);
        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);
        System.out.println("Enter the birthYear: ");
        int birthYear = scanner.nextInt();
        person.setBirthYear(birthYear);
    }

    public static void output (Person person) {
        System.out.println(person);
        System.out.println(person.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

class Task3{
    public static void main (String[] args) {
        Person person1 = new Person();
        Person.input(person1);
        Person person2 = new Person();
        Person.input(person2);
        Person person3 = new Person();
        Person.input(person3);
        Person person4 = new Person();
        Person.input(person4);
        Person person5 = new Person();
        Person.input(person5);

        Person.output(person1);
        Person.output(person2);
        Person.output(person3);
        Person.output(person4);
        Person.output(person5);

    }
}
