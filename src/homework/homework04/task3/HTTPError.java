package homework.homework04.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public enum HTTPError {
    BR("Bad Request"), NF("Not Found"), PR("Payment Required"), UN("Unauthorized"), MNA("Method Not Allowed"),
    NA("Not Acceptable");
    private final String error;
    private static Scanner sc = new Scanner(System.in);

    HTTPError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public static void main(String[] args) {

        HTTPError nameError =
                getNumberError("Please enter the number of HTTP Error in the 400-406 range: ");

        if (nameError != null) {
            System.out.println("Name of this error: " + nameError.getError());
        }
        //sc.close();
    }

    static HTTPError getNumberError(String prompt) {
        System.out.print(prompt);
        try {
            switch (sc.nextInt()) {
                case 400-> {
                    return HTTPError.BR;
                }
                case 401 -> {
                    return HTTPError.UN;
                }
                case 402 -> {
                    return HTTPError.PR;
                }
                case 404 -> {
                    return HTTPError.NF;
                }
                case 405 -> {
                    return HTTPError.MNA;
                }
                case 406 -> {
                    return HTTPError.NA;
                }
                default -> {System.out.println("You have entered an incorrect number." +
                        " Please try another one in the 400-406 range."); return getNumberError(prompt);}
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.nextLine();
            return getNumberError(prompt);
        }
    }
}

