package practical.lessonEleven.task3;

import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        String[] usernames = {
            "bob_marley1223",
            "boy_boy_12",
            "who_is_who1221",
            "sup_sup12323",
            "just_username1232"
        };

        System.out.println("Validating usernames:");

        for (String username : usernames) {
            boolean isValid = validateUsername(username);
            String result = isValid ? "Valid" : "Invalid";
            System.out.println(username + ": " + result);
        }
    }

    public static boolean validateUsername(String username) {
        String pattern = "^[a-zA-Z0-9_]{3,15}$";
        return Pattern.matches(pattern, username);
    }
}
