package createthreadbyextendingthreadclass;

class Multithreading extends Thread{
    @Override
    public void run(){
        System.out.println("My Thread Is In The Running State");
    }
}

public class CreateThreadByExtendingThreadClass {
    public static void main(String[] args) {
        Multithreading obj = new Multithreading();
        obj.start();
    }
}
