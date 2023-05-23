package homeworks.homeworkNine.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double averageOfGrades() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void removeStudentWithLowAverage(List<Student> students) {
        students.removeIf(student -> student.averageOfGrades() < 3.0);
    }

    public void promoteCourse() {
        this.course++;
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("Name: " + student.getName() + ", course: " + course);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Integer> grades1 = new ArrayList<>();
        grades1.add(1);
        grades1.add(1);
        grades1.add(1);
        
        List<Integer> grades2 = new ArrayList<>();
        grades2.add(1);
        grades2.add(2);
        grades2.add(1);
        
        List<Integer> grades3 = new ArrayList<>();
        grades3.add(3);
        grades3.add(2);
        grades3.add(4);
        
        List<Integer> grades4 = new ArrayList<>();
        grades4.add(5);
        grades4.add(2);
        grades4.add(3);
        
        students.add(new Student("Marko", "Group C", 3, grades1));
        students.add(new Student("Elias", "Group A", 3, grades2));
        students.add(new Student("Mathias", "Group B", 1, grades3));
        students.add(new Student("Thomas", "Group A", 2, grades4));

        printStudents(students, 3);
        System.out.println();

        removeStudentWithLowAverage(students);
        for (Student student : students) {
            if (student.averageOfGrades() > 3.0) student.promoteCourse();
        }

        System.out.println("Students who have entered the next course: ");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Average grade: " + student.averageOfGrades());
            System.out.println();
        }
    }
}
