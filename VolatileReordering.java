public class VolatileReordering {
    private static boolean ready = false;
    private static int number = 0;

    public static void main(String[] args) {
        synchronized (VolatileReordering.class) {
            new Thread(() -> {
                while (!ready) Thread.yield();
                System.out.println(number); 
                
            }).start();
        }

        
        number = 421;
        ready = true; 
    }
}
