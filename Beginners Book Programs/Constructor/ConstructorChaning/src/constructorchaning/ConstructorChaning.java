package constructorchaning;

class Human{
    String s1, s2;
    public Human(){
        s1 = "Super Class";
        s2 = "Parent Class";
    }
    public Human(String str){
        s1 = str;
        s2 = str;
    }
}
class Boy extends Human{
    public Boy(){
        s2 = "Child Class";
    }
}
public class ConstructorChaning {
    public static void main(String[] args) {
        Boy obj = new Boy();
        System.out.println("String s1 Is : " + obj.s1);
        System.out.println("String s2 Is : " + obj.s2);
    }
    }

