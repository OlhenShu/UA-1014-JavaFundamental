package com.softserve.lesson08;

public class Lesson08Homework02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(new FullNameStudent(new FirstName("John"), "Smith"), 25, 5);
        Student student2 = student.clone();
        System.out.println(student.info());
        System.out.println(student2.info());

        System.out.println("---------------");
        student2.fullNameStudent.firstName.setFirstName("Jack");

        System.out.println(student.info());
        System.out.println(student2.info());
    }
}

class Student extends PersonStudent implements Cloneable {
    private int course;

    public Student(FullNameStudent fullNameStudent, int age, int course) {
        super(fullNameStudent, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.fullNameStudent = (FullNameStudent) student.fullNameStudent.clone();
        return student;
    }

    @Override
    public String info() {
        return super.info() + ", Course: <" + course + ">";
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}

class FirstName implements Cloneable {
    private String firstName;

    public FirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public FirstName clone() throws CloneNotSupportedException {
        return (FirstName) super.clone();
    }
}

class FullNameStudent implements Cloneable {
    FirstName firstName;
    private String lastName;

    public FullNameStudent(FirstName firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public FullNameStudent clone() throws CloneNotSupportedException {
        FullNameStudent fullNameStudent = (FullNameStudent) super.clone();
        fullNameStudent.firstName = (FirstName) fullNameStudent.firstName.clone();
        return fullNameStudent;
    }
}

abstract class PersonStudent {
    FullNameStudent fullNameStudent;
    private int age;

    public PersonStudent(FullNameStudent fullNameStudent, int age) {
        this.fullNameStudent = fullNameStudent;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: <" + fullNameStudent.firstName.getFirstName() + ">, Last name: <" + fullNameStudent.getLastName() + ">, Age: <" + age + ">";
    }

    public abstract String activity();
}
