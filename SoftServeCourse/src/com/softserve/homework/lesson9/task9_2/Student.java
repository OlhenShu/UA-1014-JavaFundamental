package homework.lesson9.task9_2;
import java.util.*;
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

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public double averageScore(){
        double sum = 0;
        for(var grad : grades){
            sum += grad;
        }
        return  sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student {" +
                "name ='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                "}";
    }
    public static void checkAverageScore(List<Student> students){
        ListIterator<Student> studentIterator = students.listIterator();
        while(studentIterator.hasNext()){
            Student nextStudent = studentIterator.next();
            if(nextStudent.averageScore() < 3){
                studentIterator.remove();
            }
        }
    }
    public static void printStudent(List<Student> students,int course){
        boolean check = false;
        for(var stud : students){
            if(stud.getCourse() == course){
                System.out.printf("Student name from this course is %s",stud.getName());
                check = true;
            }
        }
        if (check != true){
            System.out.println("There is no such student or the course is entered incorrectly");
        }
    }

}
