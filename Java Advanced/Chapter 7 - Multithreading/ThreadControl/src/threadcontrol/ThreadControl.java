package threadcontrol;

import java.util.logging.Level;
import java.util.logging.Logger;

class Threading implements Runnable
{
    public Thread thread;
    private String threadName;
    boolean suspended = false;
    
    Threading(String name)
    {
        this.threadName = name;
        System.out.println("Creating : " + threadName);
    }
    
    @Override
    public void run() 
    {
        System.out.println("Running : " + threadName);
        try
        {
            for(int i = 10; i > 0; i--)
            {
                System.out.println("Thread : " + threadName + ", Count : " + i);
                Thread.sleep(300);
                synchronized(this)
                {
                    while(suspended)
                    {
                        wait();
                    }
                }
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread : " + threadName + " Interrupted");
        }
        System.out.println("Thread : " + threadName + " Exiting");
    }
    public void start()
    {
        System.out.println("Starting : " + threadName);
        if(thread == null)
        {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
    void suspend()
    {
        suspended = true;
    }
    synchronized void resume()
    {
        suspended = false;
        notify();
    } 
}

public class ThreadControl {
    public static void main(String[] args) {
        Threading T1 = new Threading("Thread-1");
        T1.start();
        Threading T2 = new Threading("Thread-2");
        T2.start();
        
        try
        {
            Thread.sleep(1000);
            T1.suspend();
            System.out.println("Suspending First Thread");
            Thread.sleep(1000);
            T1.resume();
            System.out.println("Resuming First Thread");
            
            Thread.sleep(1000);
            T2.suspend();
            System.out.println("Suspending Second Thread");
            Thread.sleep(1000);
            T2.resume();
            System.out.println("Resuming Second Thread");
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Main Thread Interrupted");
        }
        try
        {
            System.out.println("Waiting For Threads To Finish");
            T1.thread.join();
            T2.thread.join();
        }
        catch (InterruptedException e) 
        {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}