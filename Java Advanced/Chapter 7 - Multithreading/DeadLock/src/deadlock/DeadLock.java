package deadlock;
// Change The Order Of Lock In ThreadDemo2 & This Will Work Fine.
public class DeadLock {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    private static class ThreadDemo1 extends Thread
    {
        @Override
        public void run()
        {
            synchronized(Lock1)
            {
                System.out.println("Thread 1 : Holding The Lock-1");
                try
                {
                    Thread.sleep(10);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Interrupted");
                }
                System.out.println("Thread 1 : Waiting For Lock-2");
                synchronized(Lock2)
                {
                System.out.println("Thread 1 : Holding Lock-1 & Lock-2");
                }
            }
        }
    }
    private static class ThreadDemo2 extends Thread
    {
        @Override
        public void run()
        {
            synchronized(Lock2)
            {
                System.out.println("Thread 2 : Holding The Lock-1");
                try
                {
                    Thread.sleep(10);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Interrupted");
                }
                System.out.println("Thread 2 : Waiting For Lock-2");
                synchronized(Lock1)
                {
                System.out.println("Thread 2 : Holding Lock-1 & Lock-2");
                }
            }
        }
    }
    public static void main(String[] args) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }
}