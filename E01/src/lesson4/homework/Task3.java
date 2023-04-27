package lesson4.homework;

import java.util.Scanner;

enum HTTPError {
    ERROR_400 ("Bad Request"), ERROR_401 ("Unauthorized"), ERROR_402 ("Payment Required");

    private String error;

    HTTPError (String error)    {
        this.error = error;
    }

    public String getError() {
        return  error;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of HTTP error");
        String errornumber = scanner.nextLine();
        HTTPError error;
        error = switch (errornumber) {
            case "400" -> HTTPError.ERROR_400;
            case "401" -> HTTPError.ERROR_401;
            case "402" -> HTTPError.ERROR_402;
            default -> throw new IllegalStateException("Unexpected value: " + errornumber);
        };
        System.out.println("The name of the error is: " + error.getError());
        scanner.close();
    }
}
