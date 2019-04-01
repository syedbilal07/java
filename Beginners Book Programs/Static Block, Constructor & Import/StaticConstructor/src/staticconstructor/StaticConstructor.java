package staticconstructor;

class Static{
    public Static(){
        System.out.println("Default Static Constructor Of Parent Class");
    }
}
class Extending extends Static{
    Extending(){
        /*By default super() is hidden here */
        System.out.println("Default Static Constructor Of Extending Class");
    }
    public void display(){
        System.out.println("Display Method Of Extending Class");
    }
}
public class StaticConstructor {
    public static void main(String[] args) {
        Extending obj = new Extending();
        obj.display();
    }
}
