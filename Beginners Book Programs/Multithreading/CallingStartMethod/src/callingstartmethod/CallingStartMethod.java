package callingstartmethod;

class Threading extends Thread{
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

public class CallingStartMethod {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Threading(), "th1");
        Thread th2 = new Thread(new Threading(), "th2");
        Thread th3 = new Thread(new Threading(), "th3");
        th1.start();
        th2.start();
        th3.start();
    }
}
