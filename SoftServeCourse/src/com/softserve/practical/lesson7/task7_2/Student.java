package practical.lesson7.task7_2;

public class Student extends Person{
    private final String TYPE_PERSON;
    public Student(String name){
        super(name);
        this.TYPE_PERSON = getClass().getSimpleName();
    }
    @Override
    public void print(){
        System.out.println("I am a " + getTYPE_PERSON());
    }
    public String getTYPE_PERSON(){
        return TYPE_PERSON;
    }
}
