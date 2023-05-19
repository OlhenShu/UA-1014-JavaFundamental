package homework.lesson10.task10_3;

import java.util.Comparator;

public class SortedByCourse implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCourse(), o2.getCourse());
    }
}
