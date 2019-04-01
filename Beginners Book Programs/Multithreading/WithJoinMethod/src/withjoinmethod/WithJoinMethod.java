package withjoinmethod;

class Threading implements Runnable{
    @Override
    public void run(){
        Thread myThread = Thread.currentThread();
        System.out.println("My Thread Started " + myThread.getName());
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
           System.out.println("Thread Encountered An Error " + e); 
        }
        System.out.println("Thread Ended : " + myThread.getName());
    }
}

public class WithJoinMethod {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Threading(), "th1");
        Thread th2 = new Thread(new Threading(), "th2");
        Thread th3 = new Thread(new Threading(), "th3");
        th1.start();
        try{
            th1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        th2.start();
        try{
            th2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        th3.start();
        try{
            th3.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All Threads Have Finished Execution");
    }
}
