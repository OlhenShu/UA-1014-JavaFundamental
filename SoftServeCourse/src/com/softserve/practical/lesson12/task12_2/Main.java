package practical.lesson12.task12_2;

public class Main {
        public static void main(String[] args) {
            try {
                Plant pl = new Plant("rose", "white", 5);
                System.out.println(pl);
            } catch (ColorException | TypeException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }

    }
