package abstractinterface;

interface Multiply{
    public abstract int MultiplyTwo(int m1, int m2);
    public abstract int MultiplyThree(int m1, int m2, int m3);
}
class Result implements Multiply{
    @Override
    public int MultiplyTwo(int m1, int m2){
        return m1 * m2;
    }
    @Override
    public int MultiplyThree(int m1, int m2, int m3){
        return m1 * m2 * m3;
    }
}
public class AbstractInterface {
    public static void main(String[] args) {
        Result obj = new Result();
        System.out.println(obj.MultiplyTwo(2, 2));
        System.out.println(obj.MultiplyThree(2, 2, 2));
    }
}
