package methodoverloading;

class Overloading{
    public void myMethod(char b, int a){
        System.out.println("a and b are: " + a + " " + b);
    }
    public void myMethod(int a, char b){
        System.out.println("a and b are: " + a + " " + b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.myMethod('B', 10);
        obj.myMethod(10, 'A');
    }  
}
