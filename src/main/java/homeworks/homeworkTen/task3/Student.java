package homeworks.homeworkTen.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> list, int course) {
        boolean containsStudents = false;
        System.out.print("Students erolled in course " + course + ": ");
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            var value = it.next();
            if (value.getCourse() == course) {
                System.out.print(value.getName() + " ");
                containsStudents = true;
            }
        }
        if (!containsStudents) System.out.println("Students not found in such course");
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mathias", 2));
        students.add(new Student("Elias", 2));
        students.add(new Student("Tobias", 1));
        students.add(new Student("Louis", 3));
        students.add(new Student("Thomas", 3));

        System.out.println("Students sorted by name: ");
        Collections.sort(students);
        students.forEach(student -> System.out.println("Name: " + student.getName() + ", course: " + student.getCourse()));
        
        System.out.println("\nStudents sorted by course: ");
        Collections.sort(students, Comparator.comparingInt(Student::getCourse));
        students.forEach(student -> System.out.println("Name: " + student.getName() + ", course: " + student.getCourse()));
        System.out.println();
        
        int course = 3;
        printStudents(students, course);
    }
}
