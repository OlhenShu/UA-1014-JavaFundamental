package homework.homework04.task3;

import java.util.Scanner;

public enum HTTPError {
    BR("Bad Request"), NF("Not Found"), PR("Payment Required"), UN("Unauthorized"), MNA("Method Not Allowed"),
    NA("Not Acceptable");
    private final String error;

    HTTPError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of HTTP Error in the 400-406 range: ");

        HTTPError nameError = null;
        
        switch (sc.nextInt()) {
            case 400-> nameError = HTTPError.BR;
            case 401 -> nameError = HTTPError.UN;
            case 402 -> nameError = HTTPError.PR;
            case 404 -> nameError = HTTPError.NF;
            case 405 -> nameError = HTTPError.MNA;
            case 406 -> nameError = HTTPError.NA;
            default -> System.out.println("You have entered an incorrect number." +
                    " Please try another one in the 400-406 range.");
        }
        if (nameError != null) {
            System.out.println("Name of this error: " + nameError.getError());
        }
        sc.close();
    }
}

