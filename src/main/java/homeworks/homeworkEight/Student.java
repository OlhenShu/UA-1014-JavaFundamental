package homeworks.homeworkEight;

public class Student extends Person implements Cloneable {
    private int course;
    
    public Student (FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + getCourse();
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
