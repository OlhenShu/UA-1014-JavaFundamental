package homework.lesson10.task10_3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student  {
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
    public static void printStudents(List<Student> list, int course){
        List<Student> localStudentList = new ArrayList<>();
        ListIterator<Student> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getCourse() == course){
                localStudentList.add(list.get(iterator.previousIndex()));
            }
        }
        System.out.println("Student/s on " + course + " course\n" + localStudentList);
    }

    @Override
    public String toString() {
        return String.format("Student name: %s,course: %d",name,course);
    }
}
