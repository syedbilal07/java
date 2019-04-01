package supermethodcalls;
class Parent{
    Parent(){
        System.out.println("Constructor Of Parent Class");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Constructor Of Child Class");
    }
    void  display(){
        System.out.println("Display Method");
    }
}
public class SuperMethodCalls {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
