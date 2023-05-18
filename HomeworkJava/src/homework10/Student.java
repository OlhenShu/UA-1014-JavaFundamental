package homework10;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student  {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.course = course;
        this.name = name;
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
}
class NameComparator implements Comparator <Student>{
    public int compare (Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class CourseComparator  implements Comparator <Student>{
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getCourse(), s2.getCourse());
    }
}

