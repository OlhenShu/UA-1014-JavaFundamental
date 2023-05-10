package lesson8.homework;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(String firstName, String lasName, int age, int course) {
        super(firstName, lasName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + " course is " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

