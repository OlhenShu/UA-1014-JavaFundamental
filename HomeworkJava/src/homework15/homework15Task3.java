package homework15;
public class homework15Task3 {
    public  static void main(String[] args){

        var thread1 = new Thread(() ->{
            var thread2 = new Thread(() ->{
                for(int j = 0; j < 3; j++){
                    System.out.println("Thread number two");
                }
            });
            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            var thread3 = new Thread(() ->{
                for(int j = 0; j < 5; j++){
                    System.out.println("Thread number three");
                }
            });
            thread3.start();
        });

        thread1.start();



    }

}
