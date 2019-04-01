package genericclasses;



public class GenericClasses<T>
{
        private T a;
        public void add(T a)
        {
            this.a = a;
        }
        public T getValue()
        {
            return a;
        }
    public static void main(String[] args) {
        GenericClasses<Integer> integerBox  = new GenericClasses<Integer>();
        GenericClasses<String> stringBox = new GenericClasses<String>();
        
        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));
        
        System.out.printf("Integer Value : %d \n", integerBox.getValue());
        System.out.printf("String Value : %s \n", stringBox.getValue());
    }
}