package practical.lesson7.task7_2;

public class Teacher extends Staff{
    private final String TYPE_PERSON;
    public Teacher(String name,double salary){
        super(name,salary);
        this.TYPE_PERSON = getClass().getSimpleName();
    }
    @Override
    public void print(){
        System.out.println("I am a " + getTYPE_PERSON());
    }
    @Override
    public void salary(){
        System.out.println("My salary is " + getSalary());
    }
    public String getTYPE_PERSON(){
        return TYPE_PERSON;
    }
}
