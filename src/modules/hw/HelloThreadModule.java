package modules.hw;

public class HelloThreadModule extends Thread {
    public void run() {
        try {
            System.out.println("Hello world in thread: " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
