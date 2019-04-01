package genericclass;

public class GenericClass<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        GenericClass<Integer> intBox = new <Integer>GenericClass();
        GenericClass<String> strBox = new <String>GenericClass();
        intBox.add(new Integer(7));
        strBox.add(new String("Bilal"));
        System.out.printf("Integer Value Is : %d", intBox.get());
        System.out.println();
        System.out.printf("String Value Is : %s", strBox.get());
        System.out.println();
    }
}
