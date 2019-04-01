package dataencapsulation;
class Encapsulation{
    private int ssn;
    private String empName;
    private int empAge;
    public int getEmpSSN(){
        return ssn;
        }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
    public void setEmpAge(int newValue){
        empAge = newValue;
    }
    public void setEmpName(String newValue){
        empName = newValue;
    }
    }
public class DataEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setEmpAge(23); 
        obj.setEmpName("Syed Bilal");
        obj.setEmpSSN(007);
        System.out.println("The Employee Name Is " + obj.getEmpName());
        System.out.println("The Employee Age Is " + obj.getEmpAge());
        System.out.println("The Employee SSN Is " + obj.getEmpSSN());
    } 
}
