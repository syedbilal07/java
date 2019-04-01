package anonymousinnerclassasargument;

interface Message
{
    String greet();
}

public class AnonymousInnerClassAsArgument {
    // method which accepts the object of interface Message
    public void myMessage(Message m)
    {
        System.out.println(m.greet() + ", This is an example of anonymous inner class as an argument");  
    }
    public static void main(String[] args) {
        AnonymousInnerClassAsArgument obj = new AnonymousInnerClassAsArgument();
        obj.myMessage(new Message(){
            public String greet()
            {
                return "Hello";
            }
        });
    }
}