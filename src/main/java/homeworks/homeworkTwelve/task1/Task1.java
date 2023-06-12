package homeworks.homeworkTwelve.task1;

public class Task1 {
    public static void main(String[] args) {
        try {
            double result = div(4, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double div(double a, double b) throws ArithmeticException {
        if (a == 0 || b == 0) throw new ArithmeticException("Division by zero error. The result is zero");
        return a / b;
    }
}
