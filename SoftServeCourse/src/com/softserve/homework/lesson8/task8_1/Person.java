package homework.lesson8.task8_1;
public abstract class Person{
    private int age;
    private FullName fullName;

    protected Person(int age, FullName fullName){
        this.age = age;
        this.fullName = fullName;
    }
    static public class FullName{
       private String firstName;
        private String lastName;
        public FullName(String fn, String ln ){
            this.firstName = fn;
            this.lastName = ln;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public String info(){
        return String.format("First name: %s, Last name: %s, Age: %d",
                fullName.firstName,fullName.lastName,age);
    }
    public abstract String activity();
}
