package lesson8.homework;


public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("Alf", "Melmak", 20, 2);
        Student student2 = new Student("Bob", "Button", 21, 3);
        System.out.println(student1.info() + ", " + student1.activity());
        System.out.println(student2.info() + ", " + student2.activity());
        Student student3 = student1.clone();
        student3.setCourse(4);
        System.out.println(student3.info() + ", " + student3.activity());
    }
}
