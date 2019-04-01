package threadclassdemo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadClassDemo {
    public static void main(String[] args) {
        Runnable hello = new DisplayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("hello");
        System.out.println("Starting Hello Thread");
        thread1.start();
        
        Runnable bye = new DisplayMessage("GoodBye");
        Thread thread2 = new Thread(bye);
        thread2.setDaemon(true);
        thread2.setName("bye");
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Starting Good Bye Thread");
        thread2.start();
        
        System.out.println("Starting thread3...");
        Thread thread3 = new GuessANumber(27);
        thread3.start();
        try
        {
            thread3.join();
        } catch (InterruptedException ex) 
        {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Starting thread4...");
        Thread thread4 = new GuessANumber(75);
        thread4.start();
        
        System.out.println("main() is ending...");
    }
}