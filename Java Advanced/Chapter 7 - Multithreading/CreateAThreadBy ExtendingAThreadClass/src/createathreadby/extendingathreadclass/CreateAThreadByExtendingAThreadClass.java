package createathreadby.extendingathreadclass;

class Threading extends Thread
{
    private Thread thread;
    private final String threadName;
    
    Threading(String name)
    {
        threadName = name;
        System.out.println("Creating " + name);
    }
    
    @Override
    public void run()
    {
        System.out.println("Running " + threadName);
        try
        {
            for(int i = 4; i > 0; i--)
            {
                System.out.println("Thread " + threadName + ", Count No : " + i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + " Exiting"); 
    }
    @Override
        public void start()
        {
            if(thread == null)
            {
                thread = new Thread(this, threadName);
                thread.start();
            }
        }
}

public class CreateAThreadByExtendingAThreadClass {
    public static void main(String[] args) {
        Threading t1 = new Threading("Thread 1");
        t1.start();
        Threading t2 = new Threading("Thread 2");
        t2.start();
    }
}