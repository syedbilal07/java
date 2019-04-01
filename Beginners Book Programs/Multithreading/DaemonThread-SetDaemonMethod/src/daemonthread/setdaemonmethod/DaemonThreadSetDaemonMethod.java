package daemonthread.setdaemonmethod;

class Threading extends Thread{
    @Override
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread Executing");
        }
        else{
            System.out.println("User Thread Executing");
        }
    }
}
        
public class DaemonThreadSetDaemonMethod {
    public static void main(String[] args) {
        Threading obj1 = new Threading();
        Threading obj2 = new Threading();
        obj1.setDaemon(true);
        obj1.start();
        obj2.start();
    }
}
