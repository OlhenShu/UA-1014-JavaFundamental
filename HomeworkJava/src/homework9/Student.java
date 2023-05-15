package homework9;

import java.util.List;

public class Student {
    private String name;
    private String group;
    int course;
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

    public double getAverageGrade() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.format("Студент на %d курсе:%n", course);
        for (Student student : students) {
                System.out.println(student.getName());
        }
    }
}
