package Mutithreading;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t = new MyThread(); 
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