package lesson10.homework;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int course;

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

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alf", 2));
        students.add(new Student("Bob", 3));
        students.add(new Student("Claire", 4));
        students.add(new Student("Dilan", 2));
        students.add(new Student("Etan", 1));

        System.out.println("Students enrolled in course 2:");
        Student.printStudents(students, 2);

        students.sort(Student.compareByName());
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        students.sort(Student.compareByCourse());
        System.out.println("Students sorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }
    }
}
