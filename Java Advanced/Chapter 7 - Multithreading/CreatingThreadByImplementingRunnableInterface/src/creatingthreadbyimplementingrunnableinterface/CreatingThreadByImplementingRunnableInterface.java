package creatingthreadbyimplementingrunnableinterface;

class Threading implements Runnable
{
    private Thread thread;
    private String threadName;
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
                System.out.println("Thread " + threadName + i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + "Exiting");
    }
    public void start()
    {
        System.out.println("Starting " + threadName);
        if(thread == null)
        {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

public class CreatingThreadByImplementingRunnableInterface{
    public static void main(String[] args) {
        Threading t1 = new Threading("Thread-1 ");
        t1.start();
        Threading t2 = new Threading("Thread-2 ");
        t2.start();
    }
}