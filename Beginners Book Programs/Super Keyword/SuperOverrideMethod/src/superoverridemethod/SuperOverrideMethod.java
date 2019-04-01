package superoverridemethod;

class Parent{
    void display(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("Child Class");
    }
    void PrintMessage(){
        display();
        super.display();
    }
}

public class SuperOverrideMethod {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.PrintMessage();
    }
}
