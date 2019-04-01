package dataencapsulation;

class Encapsulate
{
    private String name;
    private int age;
    private String address;
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;   
    }
}

public class DataEncapsulation {
    public static void main(String[] args) {
        Encapsulate en = new Encapsulate();
        en.setName("Syed Bilal");
        en.setAge(24);
        en.setAddress("Hill Town");
        System.out.println("The Name Is : " + en.getName());
        System.out.println("The Age Is : " + en.getAge());
        System.out.println("The Address Is : " + en.getAddress());
    }
}