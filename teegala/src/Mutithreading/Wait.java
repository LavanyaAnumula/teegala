package Mutithreading;

class SimpleShared {
    synchronized void doWait() {
        try {
            System.out.println("Thread is waiting...");
            wait(); 
            System.out.println("Thread got notified!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void doNotify() {
        System.out.println("Notifying the waiting thread...");
        notify(); 
    }
}