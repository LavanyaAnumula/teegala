package Mutithreading;

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();  
        Thread t = new Thread(r);          
        t.start();                        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
