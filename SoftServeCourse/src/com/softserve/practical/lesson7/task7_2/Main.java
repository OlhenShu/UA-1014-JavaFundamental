package practical.lesson7.task7_2;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Cleaner("Rostuslav",600),
                new Student("Roman"),
                new Teacher("Anna",900),
                new Student("Artem"),
                new Cleaner("Olena",700),
                new Teacher("Andriy",900),
        };
        for(Person per : people){
            per.print();
            if(per instanceof Cleaner){
                ((Cleaner) per).salary();
            }
            if(per instanceof Teacher){
                ((Teacher) per).salary();
            }
        }

    }
}
