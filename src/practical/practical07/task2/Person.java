package practical.practical07.task2;

public abstract class Person {
    String name;
    abstract void print();
}
abstract class Staff extends Person {
    final String TYPE_PERSON;

    Staff (String type) {
        TYPE_PERSON = type;
    }

    @Override
    void print() {
        System.out.print("I am a " + TYPE_PERSON + ". ");
    }

    abstract void salary();
}
class Students extends Person {
    final String TYPE_PERSON;

    Students(String type) {
        TYPE_PERSON = type;
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + ". ");
    }
}

class Teachers extends Staff {

    Teachers(String type) {
        super(type);
    }

    @Override
    void salary() {
        System.out.println("My salary is \u20B4 1500.");;
    }
}
class Cleaners extends Staff {

    Cleaners(String type) {
        super(type);
    }

    @Override
    void salary() {
        System.out.println("My salary is \u20B4 1000.");
    }
}

class Persons{
    public static void main(String[] args){
        Person[] persons = {
                new Students("student"),
                new Teachers("teacher"),
                new Cleaners("cleaner")
        };

        for (Person person: persons){
            if (person instanceof Students student){
                student.print();
            }
            if(person instanceof Staff staff){
                staff.print();
                staff.salary();
            }
        }
    }
}
