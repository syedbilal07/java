package threadclassdemo;

public class DisplayMessage implements Runnable{
    private String message;

    public DisplayMessage(String myMessage) 
    {
        this.message = myMessage;
    }
    
    @Override
    public void run() 
    {
        while(true)
        {
            System.out.println("Message Is : " + message);
        }
    }
}