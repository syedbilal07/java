package constructorexample;

class Constructor{
    private final int var;
    public Constructor(){
        var = 10;
    }
    public Constructor(int num){
        var = num;
    }
    public int getValue(){
        return var;
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println("The Value Is : " +obj.getValue());
    }
}

