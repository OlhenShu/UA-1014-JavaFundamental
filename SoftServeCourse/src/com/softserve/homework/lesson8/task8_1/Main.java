package homework.lesson8.task8_1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(
                new Person.FullName("Oleg","Sharskiy"),20,3
        );
        Student student2 = new Student(
                new Person.FullName("Mariya","Kordenko"),19,2
        );
        System.out.printf("%s , %s\n",student1.info(),student1.activity());
        System.out.printf("%s , %s\n",student2.info(),student2.activity());
        Student student3 = student1.clone();
        student3.setCourse(2);
        System.out.printf("%s , %s\n",student3.info(),student3.activity());
    }
}
