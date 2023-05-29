package homework13;

public class homework13Task1 {
    public  static void main(String[] args) {
        String s = "abc";
        int n = 3;
        String encryptBuilder = encrypt(s, n);
        System.out.println(encryptBuilder);
        String decryptBuilder2 = decrypt(encryptBuilder, n);
        System.out.println(decryptBuilder2);
    }
     static String encrypt(String s, int n) {
         StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < s.length(); i++){
             int numericalValue = s.charAt(i);
             char encryptChar = (char) (numericalValue + n);
             stringBuilder.append(encryptChar);
         }
         return stringBuilder.toString();
    }
    static String decrypt(String s, int n){
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            int numericalValue = s.charAt(i);
            char decryptChar = (char) (numericalValue - n);
            stringBuilder2.append(decryptChar);
        }
        return stringBuilder2.toString();
    }
}

