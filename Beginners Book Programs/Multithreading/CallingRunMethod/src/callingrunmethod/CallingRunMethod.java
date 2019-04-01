package callingrunmethod;

class Threading implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 3; i++){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(i);
        } 
    }
}

public class CallingRunMethod {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Threading(), "th1");
        Thread th2 = new Thread(new Threading(), "th2");
        th1.run();
        th2.run();     
    } 
}
