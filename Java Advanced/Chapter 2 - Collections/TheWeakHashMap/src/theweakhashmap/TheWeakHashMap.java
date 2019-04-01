package theweakhashmap;
import java.util.*;

public class TheWeakHashMap {
    private static Map map;
    public static void main(String[] args) {
        map = new WeakHashMap();
        map.put(new String("Syed"), "Bilal");
        
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                while(map.containsKey("Syed"))
                {
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println("Exception Caught " + e);
                    }
                    System.out.println("Thread Waiting");
                    System.gc();

                }
            }
        };
        Thread t = new Thread(runner);
        t.start();
        System.out.println("Main Waiting");
        try 
        {
            t.join();
        }
        catch (InterruptedException ignored) 
        {
        }
    }
}