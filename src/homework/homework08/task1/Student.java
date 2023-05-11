package homework.homework08.task1;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course:  " + course;
    }

    @Override
    String activity() {
        return "I study at university";
    }
    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.setFullName(clone.getFullName().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void main(String[] args){
        Student student1 = new Student(new FullName("Hermione", "Granger"),18,3);
        Student student2 = new Student(new FullName("Ron","Weasley"),19,3);
        System.out.println("student1 = " + student1.info() + ". " + student1.activity() + ".");
        System.out.println("student2 = " + student2.info() + ". " + student2.activity() + ".");

        Student student1Clone = student1.clone();
        System.out.println("student1Clone = " + student1Clone.info() + ". " + student1Clone.activity() + ".");

        student1Clone.setCourse(4);

        System.out.println("student1 = " + student1.info() + ". " + student1.activity() + ".");
        System.out.println("student1Clone = " + student1Clone.info() + ". " + student1Clone.activity() + ".");
    }


}
