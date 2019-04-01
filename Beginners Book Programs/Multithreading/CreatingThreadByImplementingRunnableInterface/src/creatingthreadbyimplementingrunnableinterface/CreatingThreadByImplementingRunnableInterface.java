package creatingthreadbyimplementingrunnableinterface;

class Threading implements Runnable{
    @Override
    public void run(){
        System.out.println("My Thread Is In Running State");
    }
}

public class CreatingThreadByImplementingRunnableInterface {
    public static void main(String[] args) {
        Threading obj1 = new Threading();
        Thread obj2 = new Thread(obj1);
        obj2.start();
    }
}
