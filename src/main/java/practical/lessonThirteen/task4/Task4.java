package practical.lessonThirteen.task4;

import java.util.Random;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(20);
        }

        for (int numb : numbers) {
            System.out.print(numb + " ");
        }

        int count = count(numbers, number -> number % 2 == 0);
        System.out.println("\nCount: " + count);
    }

    public static int count(Integer[] array, Predicate<Integer> condition) {
        int count = 0;
        for (Integer number : array) {
            if (condition.test(number)) count++;
        }
        return count;
    }
}
