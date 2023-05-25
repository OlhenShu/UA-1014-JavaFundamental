package com.softserve.edu04;

import java.util.Scanner;

/**
 * Input a number representing an HTTP error (such as 400, 401, 402, etc.) and output the name
 * of the error using an enum called HTTPError.
 */
public class HTTPErrorMain {
    enum HTTPError {
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        PAYMENT_REQUIRED(402),
        FORBIDDEN(403),
        NOT_FOUND(404);

        private final int errorCode;

        HTTPError(int errorCode) {
            this.errorCode = errorCode;
        }

        public int getErrorCode() {
            return errorCode;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter http error code: ");
            int errorCode = input.nextInt();

            input.close();

            for (HTTPError error : HTTPError.values()) {
                if (errorCode == error.getErrorCode()) {
                    System.out.printf("Your error code: %s", error.name());
                    return;
                }
            }

            System.out.print("Your error code not found.");
        } finally {
            input.close();
        }
    }
}
