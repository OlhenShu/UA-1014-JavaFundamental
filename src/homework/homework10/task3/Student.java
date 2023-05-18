package homework.homework10.task3;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Student implements Comparator<Student>{
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void main(String[] args){
        Student student1 = new Student("Bob", 2);
        Student student2 = new Student("Alice", 2);
        Student student3 = new Student("Monica", 1);
        Student student4 = new Student("Jack",3 );
        Student student5 = new Student("George", 1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        Collections.sort(studentList, new Student());
        System.out.println();
        sortByCourse(studentList);
    }

    public static void printStudents (List<Student> studentList, int course){
        for (var student : studentList){
            if (student.getCourse() == course) {
                System.out.println("A student named " + student.getName() + " is enrolled in the " + course + " course.");
            }
        }
    }
    public static void sortByCourse (List<Student> studentList){
        for (int i = 1; i < 5; i++){
            printStudents(studentList, i);
        }
    }

    public boolean equalsByName(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }


    public boolean equalsByCourse(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }


    @Override
    public int compare(Student s1, Student s2) {
         return s1.name.compareTo(s2.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
