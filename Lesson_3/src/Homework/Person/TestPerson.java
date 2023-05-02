package Homework.Person;


public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Roman", "Zozulia");
        p1.setBirthYear(2003);
        p1.output();

        Person p2 = new Person("Iryna", "Zozulia");
        p2.setBirthYear(2004);
        p2.output();

        Person p3 = new Person("Tony", "Stark");
        p3.setBirthYear(1971);
        p3.output();

        Person p4 = new Person("Steve", "Rogers");
        p4.setBirthYear(1903);
        p4.output();

        Person p5 = new Person();
        p5.setFirstName("Yulia");
        p5.setLastName("Lisovska");
        p5.setBirthYear(1991);
        p5.output();

        Person p6 = new Person();
        p6.changeName("Nick", "Fury");
        p6.setBirthYear(1960);
        p6.output();

        Person p7 = new Person();
        p7.input();
        p7.output();

    }
}
