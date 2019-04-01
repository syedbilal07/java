package withoutjoinmethod;

class Threading implements Runnable{
    @Override
    public void run(){
        Thread myThread = Thread.currentThread();
        System.out.println("Thread Started : " + myThread.getName());
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
           System.out.println("Thread Encountered An Error " + e); 
        }
        System.out.println("Thread Ended : " + myThread.getName());
    }
}

public class WithoutJoinMethod {
    public static void main(String[] args) {
        Thread obj1 = new Thread(new Threading(), "obj1");
        Thread obj2 = new Thread(new Threading(), "obj2");
        Thread obj3 = new Thread(new Threading(), "obj3");
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
