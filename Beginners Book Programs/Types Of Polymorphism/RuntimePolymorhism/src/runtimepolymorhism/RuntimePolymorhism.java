package runtimepolymorhism;

class X{
    public void methodA(){
        System.out.println("Hello, I'm Method-A Of Class X");
    }
}
class Y extends X{
    @Override
    public void methodA(){
        System.out.println("Hello, I'm Method-A Of Class Y");
    }
}

public class RuntimePolymorhism {
    public static void main(String[] args) {
        X obj1 = new X();
        X obj2 = new Y();
        obj1.methodA();
        obj2.methodA();
    } 
}
