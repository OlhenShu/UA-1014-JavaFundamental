package lesson4;

class Scratch {
    public static void main(String[] args) {
        int i = 12;
        switch (i) {
            case 1:
                System.out.println("One");
                // fall through
            case 12:
                System.out.println("Twelve");
                break;
            default:
                System.out.println("Something else");
            case 2:
                System.out.println("Two");
                break;
        }
        System.out.println("End");
    }
}