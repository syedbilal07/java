package accessinginstancevariablesandmethods;

public class AccessingInstanceVariablesAndMethods {
    int puppyAge;
    public AccessingInstanceVariablesAndMethods(String name)
    {
        System.out.println("The Name Is : " + name);
    }
    public void setAge(int Age)
    {
        puppyAge = Age;
    }
    public int getAge()
    {
        System.out.println("Puppy's Age Is :" + puppyAge );
        return puppyAge;
    }
    public static void main(String[] args) {
        /* Object creation */
        AccessingInstanceVariablesAndMethods obj = new AccessingInstanceVariablesAndMethods("Tom");
        obj.setAge(2);
        obj.getAge();
    }
}
