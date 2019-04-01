package thestack;
import java.util.*;

public class TheStack {
    static void showPush(Stack st, int i)
    {
        st.push(new Integer(i));
        System.out.println("Push (" + i + ")");
        System.out.println("Stack : " + st);
    }
    static void showPop(Stack st)
    {
        System.out.println("pop - >");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack : " + st);
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);
        showPop(st);
        showPop(st);
        showPop(st);
        try 
        {
            showPop(st);
        }
        catch (EmptyStackException e) 
        {
            System.out.println("empty stack");
        }
    }
}