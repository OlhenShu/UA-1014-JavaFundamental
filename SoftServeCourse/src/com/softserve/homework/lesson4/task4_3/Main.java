package task4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the error (400 - 408):");
        String indexOfError = scan.nextLine();
        scan.close();
        HTTPError error =
                switch (indexOfError){
           case "400" -> HTTPError.BAD_REQUEST;
           case "401" -> HTTPError.UNAUTHORIZED;
           case "402" -> HTTPError.PAYMENT_REQUIRED;
           case "403" -> HTTPError.FORBIDDEN;
           case "404" -> HTTPError.NOT_FOUND;
           case "405" -> HTTPError.METHOD_NOT_ALLOWED;
           case "406" -> HTTPError.NOT_ACCEPTABLE;
           case "407" -> HTTPError.PROXY_AUTHENTICATION_REQUIRED;
           default -> HTTPError.REQUEST_TIMEOUT;
                };
        System.out.println(error);
    }
}
