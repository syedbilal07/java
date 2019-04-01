package multithreadingwithoutsynchronization;

class Print
{
    public void printCount()
    {
        try
        {
            for(int i = 5; i > 0; i--)
            {
                System.out.println("Counter - " + i);
            }
        }
        catch (Exception e) 
        {
            System.out.println("Thread  interrupted.");
        }
    }
}

class Threading extends Thread
{
    private Thread thread;
    private String threadName;
    Print P;
    Threading(String name,Print p)
    {
        this.threadName = name;
        this.P = p;
    }
    @Override
    public void run()
    {
        P.printCount();
        System.out.println("Thread : " + threadName + " Exiting");
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

public class MultithreadingWithoutSynchronization extends Thread {
    public static void main(String[] args) {
        Print P1 = new Print();
        Threading T1 = new Threading("Thread-1", P1);
        Threading T2 = new Threading("Thread-2", P1);
        
        T1.start();
        T2.start();
        
        // wait for threads to end
        try
        {
            T1.join();
            T2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}