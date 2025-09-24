package Mutithreading;

public class WaitNotify {
    public static void main(String[] args) {
        SimpleShared obj = new SimpleShared();

        Thread t1 = new Thread(() -> obj.doWait());
        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            obj.doNotify();
        });

        t1.start();
        t2.start();
    }
}
