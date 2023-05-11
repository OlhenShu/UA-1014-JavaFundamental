package homework8;

import java.rmi.server.RemoteRef;

public class StudentMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1= new Student(new Student.FullName("Ksenia","Pupkova"), 20, 1);
        Student student2 = new Student(new Student.FullName("Vladimir","Strukov"), 19, 2);
        Student student3 = student1.clone();

        System.out.println(student1.info() + "  " + student1.activity());
        System.out.println(student2.info() + "  " + student1.activity());
        student3.setCourse(3);
        System.out.println(student3.info() + "  " + student1.activity());
    }
}