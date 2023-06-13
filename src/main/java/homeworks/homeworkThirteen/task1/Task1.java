package homeworks.homeworkThirteen.task1;

public class Task1 {
    public static void main(String[] args) {
        String string = "this is a test text";
        int shift = 5;
        System.out.println("Text before enccrypted: " + string);

        String encryptedText = encrypt(string, shift);
        System.out.println("\nEncrypted text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("\nDecrypted text: " + decryptedText);
    }

    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                char encryptedChar = (char) (((c - 'a' - n + 26) % 26) + 'a');
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder decrypted = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                char decryptedChar = (char) (((c - 'a' + n + 26) % 26) + 'a');
                decrypted.append(decryptedChar);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
