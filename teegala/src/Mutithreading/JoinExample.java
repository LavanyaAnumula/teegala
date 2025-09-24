package Mutithreading;

public class JoinExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); 

        try {
            t.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main Thread resumes after join");
    }
}
