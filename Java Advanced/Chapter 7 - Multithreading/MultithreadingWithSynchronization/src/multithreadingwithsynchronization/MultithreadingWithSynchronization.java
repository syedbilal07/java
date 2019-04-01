 package multithreadingwithsynchronization;

import java.util.logging.Level;
import java.util.logging.Logger;

class Print
{
    public void printCount()
    {
        try
        {
            for(int i = 5; i > 0; i--)
            {
                System.out.println("Count - " + i);
            }
        }
        catch(Exception e)
        {
            System.out.println("Thread Interrupted.");
        }
    }
}

class Threading extends Thread
{
    private Thread thread;
    private String threadName;
    Print P;
    
    Threading(String name, Print p)
    {
        this.threadName = name;
        this.P = p;
    }
    @Override
    public void run()
    {
        synchronized(P){
            P.printCount();
        }
        System.out.println("Thread " + threadName + " Exiting");
    }
    @Override
    public void start()
    {
        System.out.println("Thread : " + threadName + " Starting");
        if(thread == null)
        {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
public class MultithreadingWithSynchronization {
    public static void main(String[] args) {
        Print P1 = new Print();
        
        Threading T1 = new Threading("Thread-01", P1);
        T1.start();
        Threading T2 = new Threading("Thread-02", P1);
        T2.start();
        
        try
        {
            T1.join();
            T2.join();
        } catch (InterruptedException ex) 
        {
            System.out.println("Interrupted");
        }
    }
}