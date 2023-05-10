package homework.lesson8.task8_1;

public class Student extends Person implements Cloneable{
    private int course;
    public Student(FullName fullName, int age, int course){
        super(age,fullName);
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
        return super.info() + String.format(", Course: %d",course);
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
