package homeworkEight;

public class Scratch {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Student student1 = new Student(new Student.FullName("Elias", "Rossner"), 24, 4);
        Student student2 = new Student(new Student.FullName("Mathias", "King"), 23, 3);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();

        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println();
        
        Student student3 = student1.clone();
        student3.setCourse(5);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();

        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println();

        System.out.println(student3.info());
        System.out.println(student3.activity());

    }
}
