package createthreadbyimplementingrunnableinterface;

class Threading implements Runnable{
    Thread myThread;
    Threading(){
        myThread = new Thread(this, "My Runnable Interface");
        System.out.println("My Thread Is Running " + this);
        myThread.start();
    }
    @Override
    public void run(){
    try{
        for(int i = 0; i < 10; i++){
            System.out.println("Printing The Count " + i);
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e){
        System.out.println("My Thread Interrupted " + e);
    }
    System.out.println("My Thread Run Is Over");
    }
} 

public class CreateThreadByImplementingRunnableInterface {
    public static void main(String[] args) {
        Threading obj = new Threading();
        try{
            while(obj.myThread.isAlive()){
                System.out.println("Main Thread Is Alive Till Child Thread Is Live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e){
        System.out.println("Main Thread Interrupted " + e);
    }
        System.out.println("Main Thread Run Is Over");
    }
}
