package callparameterizedconstructorusingsuperkeyword;

class BaseClass
{
    int age;
    public BaseClass(int age)
    {
        this.age = age;
        
    }
    public void getAge() 
    {
      System.out.println("The value of the variable named age in super class is : " + age);
   }
}
class DerivedClass extends BaseClass
{
    int age;
    public DerivedClass(int age)
    {
        // calling the super class age
        super(age);
    }
}
public class CallParameterizedConstructorUsingSuperKeyword {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass(24);
        obj.getAge();
    }
}