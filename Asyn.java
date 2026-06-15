package Thread;
class MyThread extends Thread {
     @Override
    public void run() {
        System.out.println("pizza preparation...");
        preparePizza();
        System.out.println("Pizza is eaten");
    }

    public void preparePizza() {
        try {
            System.out.println("Preparing Pizza...");
            Thread.sleep(1000); 
            System.out.println("Pizza is ready");
        } catch (InterruptedException e) {
            System.out.println("Pizza preparation interrupted");
        }
    }
}
public class Asyn {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("Main thread is doing other work...");
    }
}