package encapsulationordatahiding;

class Encapsulation{
    private String name;
    private int age;
    private int SSN;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSSN(){
        return SSN;
    }
    public void setName(String newValue){
        name = newValue;
    }
    public void setAge(int newValue){
        age = newValue;
    }
    public void setSSN(int newValue){
        SSN = newValue;
    }
}

public class EncapsulationOrDataHiding {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Bilal");
        obj.setAge(23);
        obj.setSSN(2214257);
        System.out.println("The Name Is " + obj.getName());
        System.out.println("The Age Is " + obj.getAge());
        System.out.println("The SSN Is " + obj.getSSN());
    }
}
