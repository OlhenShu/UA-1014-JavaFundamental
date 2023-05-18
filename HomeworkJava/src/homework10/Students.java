package homework10;

import java.util.*;

public class Students {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Pol", 1);
        Student student2 = new Student("Sam", 2);
        Student student3 = new Student("Lin", 4);
        Student student4 = new Student("Sara", 5);
        Student student5 = new Student("Diana", 3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections.sort(students,new NameComparator());
        System.out.println("List of students sorted by name:");
        for (Student st : students){
            System.out.println(st.getName() + "  " + st.getCourse());
        }
        Collections.sort(students, new CourseComparator());
        System.out.println("List of students sorted by course number:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
        int courseToPrint = 3;
        System.out.println("Students enrolled in the course " + courseToPrint + ":");
        Student.printStudents(students, courseToPrint);

    }
}
