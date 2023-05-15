package homework9;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        List<Integer> grades1 = new ArrayList<>();
        grades1.add(2);
        grades1.add(4);
        grades1.add(3);
        grades1.add(1);
        Student student1 = new Student("Иван", "Группа A1", 1, grades1);
        students.add(student1);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(1);
        grades2.add(4);
        grades2.add(5);
        grades2.add(5);
        Student student2 = new Student("Катя", "Группа B1", 1, grades2);
        students.add(student2);

        List<Integer> grades3 = new ArrayList<>();
        grades3.add(1);
        grades3.add(4);
        grades3.add(3);
        grades3.add(5);
        Student student3 = new Student("Саша", "Группа B2", 1, grades3);
        students.add(student3);

        var it = students.iterator();
        while (it.hasNext()) {
            var student = it.next();
            if (student.getAverageGrade() <= 3) {
                it.remove();
            }
        }
        for (Student student : students) {
            if (student.getAverageGrade() < 3) {
                students.remove(student);
            }
        }
        Student.printStudents(students, 2);
    }
}
