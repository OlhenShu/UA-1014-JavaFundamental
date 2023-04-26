package homework.homework03.task3;

import java.util.Date;
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {

    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input("Sherlock", "Holmes", 1989);
        Person p2 = new Person ("John", "Watson");
        p2.birthYear = 1987;
        Person p3 = new Person ("Irene","Adler");
        p3.birthYear = 1993;
        Person p4 = new Person ("Mary","Morsten");
        p4.birthYear = 1992;
        p4.changeName("Mary","Watson");
        Person p5 = new Person ("James","Moriarty");
        p5.birthYear = 1984;

        System.out.println(output(p1)+ "\n" + output(p2)+ "\n" + output(p3)+"\n"+ output(p4)+"\n"+output(p5));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void input(String fn, String ln, int br){
        this.firstName = fn;
        this.lastName = ln;
        this.birthYear = br;
    }
    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
    public static String output(Person p){
        return "Person [First name = " + p.getFirstName() + ", Last name = " + p.getLastName() +
                ", birth year = " + p.getBirthYear() + ", age = " + getAge(p) + "]";
    }
    public static int getAge(Person p){
        Date date = new Date();
        int year = date.getYear() + 1900;
        return year - p.getBirthYear();
    }
}
