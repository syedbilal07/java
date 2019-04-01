package supermethod;

class Parent{
    Parent(){
        System.out.println("Constructor Of Parent Class");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Constructor Of Child Class");
    }
    Child(int num){
        System.out.println(num);
    }
    void  display(){
        System.out.println("Display Method");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.display();
        Child obj2 = new Child(10);
        obj2.display();
    }
}
