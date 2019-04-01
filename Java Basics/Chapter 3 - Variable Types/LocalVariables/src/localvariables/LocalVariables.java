package localvariables;

public class LocalVariables {
    public void pupAge()
    {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy Age Is : " + age);
    }
    public static void main(String[] args) {
        LocalVariables obj = new LocalVariables();
        obj.pupAge();
    }
}
