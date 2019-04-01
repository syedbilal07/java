package abstractclass.pkg1;

//  Abstract class can extend only one class or one abstract class at a time

class myClass1{
    public void display(){
        System.out.println("myClass1 Display Method");
    }
}
abstract class myClass2{
    void display2(){};
}
class myClass3 extends myClass2{
    @Override
    public void display2(){
        System.out.println("myClass2 Display Method In myClass3");
    }
}
public class AbstractClass1 {
    public static void main(String[] args) {
        myClass3 obj = new myClass3();
        obj.display2();
    }
}
