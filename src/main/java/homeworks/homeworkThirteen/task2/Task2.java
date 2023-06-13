package homeworks.homeworkThirteen.task2;

public class Task2 {
    public static void main(String[] args) {
        String date1 = "12.01.2023";
        boolean isValid1 = validateDateFormat(date1);
        System.out.println("Date format " + date1 + " is valid: " + isValid1);

        String date2 = "12.01.23";
        boolean isValid2 = validateDateFormat(date2);
        System.out.println("Date format " + date2 + " is valid: " + isValid2);
    }

    public static boolean validateDateFormat(String date) {
        String pattern = "\\d{2}.\\d{2}.\\d{2}";
        boolean match = date.matches(pattern);
        return match;
    }
}
