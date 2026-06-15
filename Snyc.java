package Thread;
class SyncThread extends Thread{
    private static int count = 0;
    public SyncThread(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<3;i++){
            synchronized(SyncThread.class){
                count++;
                System.out.println("Count: "+count+" by "+getName());
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println(e);
            }
        }
        System.out.println("Thread completed by "+Thread.currentThread().getName());
    }
}   
public class Snyc{
    public static void main(String args[])
    {
        SyncThread thread1 = new SyncThread("Thread 1");
        SyncThread thread2 = new SyncThread("Thread 2");
        thread1.start();
        thread2.start();
    }
}