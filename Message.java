package Thread;
class MessageSender extends Thread{
    public MessageSender(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println("Message from "+getName());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println(e);
            }
        }
        System.out.println("Message sending completed by "+Thread.currentThread().getName());
    }
}
public class Message{
    public static void main(String args[])
    {
        MessageSender sender1 = new MessageSender("Sender 1");
        MessageSender sender2 = new MessageSender("Sender 2");
        sender1.start();
        sender2.start();
    }
}