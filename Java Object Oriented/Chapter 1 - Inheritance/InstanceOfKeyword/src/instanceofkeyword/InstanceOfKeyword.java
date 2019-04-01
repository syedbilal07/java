package instanceofkeyword;

interface Animal{}
class Mammal implements Animal{}

public class InstanceOfKeyword extends Mammal {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        InstanceOfKeyword d = new InstanceOfKeyword();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
    }
}