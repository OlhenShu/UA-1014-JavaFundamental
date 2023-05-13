package homework.homework09.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] gradesInSubjects;

    public Student(String name, String group, int course, int[] gradesInSubjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradesInSubjects = gradesInSubjects;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int[] getGradesInSubjects() {
        return gradesInSubjects;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public void setCourse() {
        this.course = this.course + 1;
    }

    public void setGradesInSubjects(int[] gradesInSubjects) {
        this.gradesInSubjects = gradesInSubjects;
    }
    public int gradePointAverage(){
        int average = 0;
        for (int i: this.gradesInSubjects){
            average = average + i;
        }
        return average / this.gradesInSubjects.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", gradesInSubjects=" + Arrays.toString(gradesInSubjects) +
                '}';
    }
}

class ToDo{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Student student1 = new Student("Alexa", "A", 2, new int[]{3, 3, 5, 5, 4});
        Student student2 = new Student("Bob", "A", 1, new int[]{3, 4, 2, 2, 4});
        Student student3 = new Student("Charlie", "B", 1, new int[]{2, 2, 1, 2, 1});
        Student student4 = new Student("David", "A", 1, new int[]{4, 5, 4, 2, 3});
        Student student5 = new Student("Isabella", "B", 3, new int[]{1, 3, 3, 2, 1});
        List<Student> studentsCollection =  new ArrayList<>();
        studentsCollection.add(student1);
        studentsCollection.add(student2);
        studentsCollection.add(student3);
        studentsCollection.add(student4);
        studentsCollection.add(student5);

        removeStudentAndAppCourse(studentsCollection);

        for (Student student : studentsCollection){
            System.out.println(student.toString());
        }

        int course = getNumber(scanner,"Specify the course you are interested in: ");

        printStudents(studentsCollection,course);
    }
    public static void removeStudentAndAppCourse(List<Student> students){
        int c = 3;
        var it = students.iterator();
        while (it.hasNext()){
            var el = it.next();
            if (el.gradePointAverage() < c){
                it.remove();
            }
            else {
                el.setCourse();
            }
        }
    }
    public static void printStudents(List<Student> students, int course){
        var it = students.iterator();
        boolean check = false;
        while (it.hasNext()){
            var el = it.next();
            if (el.getCourse() == course){
                System.out.println("The name of the student enrolled in the specified course number is "
                + el.getName() + ".");
                check = true;
            }
        }
        if (check == false){
            System.out.println("No one has been enrolled in the specified course number.");
        }
    }
    static int getNumber(Scanner scanner, String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
