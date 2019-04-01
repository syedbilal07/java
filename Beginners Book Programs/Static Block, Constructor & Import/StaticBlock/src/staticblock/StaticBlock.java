package staticblock;
class Parent{
    static{
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    /*By default super() is hidden here */
    static{
       System.out.println("Child Class"); 
    }
    public void display(){
        System.out.println("Display Method Of Extending Class");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
