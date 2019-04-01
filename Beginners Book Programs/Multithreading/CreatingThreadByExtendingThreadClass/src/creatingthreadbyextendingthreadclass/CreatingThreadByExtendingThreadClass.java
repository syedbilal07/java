package creatingthreadbyextendingthreadclass;

class Count extends Thread{
    Count(){
        super("My Extending Thread");
        System.out.println("My Thread Created " + this);
        start();
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
               System.out.println("My Thread Interrupted");
            }
            System.out.println("My Thread Run Is Over");
    }
}

public class CreatingThreadByExtendingThreadClass {
    public static void main(String[] args) {
        Count obj = new Count();
        try{
            while(obj.isAlive()){
                System.out.println("Main Thread Will Be Alive Till The Child Thread Is Live");
                Thread.sleep(1500);
            }
        }   
        catch(InterruptedException e){
               System.out.println("My Thread Interrupted");
            }
            System.out.println("Main Thread Run Is Over");
    }
}
