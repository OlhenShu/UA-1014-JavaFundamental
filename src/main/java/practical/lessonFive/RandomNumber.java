package practical.lessonFive;

import java.util.Random;;

public class RandomNumber {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(200) - 100;
        }
        for (int numbers : randomNumbers) {
            System.out.print(numbers + ", ");
        }
        int biggestNumb = biggestNumber(randomNumbers);
        int sum = sumOfNumbers(randomNumbers);
        int countNegative = countNegativeNumbers(randomNumbers);
        String theMajority = determineMajorityOf(randomNumbers);

        System.out.println("\nThe biggest number of the array: " + biggestNumb);
        System.out.println("The sum of positive numbers: " + sum);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println(theMajority);
    }

    public static int biggestNumber(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (max < number) max = number;
        }
        return max;
    }

    public static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) sum += number;
        }
        return sum;
    } 

    public static int countNegativeNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) count++;
        }
        return count;
    }

    public static String determineMajorityOf(int[] numbers) {
        int countPositive = 0;
        int countNegative = 0;
        for (int number : numbers) {
            if (number > 0) countPositive++;
            if (number < 0) countNegative++;
        }
        if (countPositive > countNegative) return "There are more positive values in the array";
        if (countPositive < countNegative) return "There are more negative values in the array";
        return "There are an equal number of positive and negative values in the array";
    }
}
