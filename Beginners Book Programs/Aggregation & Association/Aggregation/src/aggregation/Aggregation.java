package aggregation;

class Address{
    int streetNum;
    String city;
    String state;
    String country;
    Address(int street, String ci, String st, String co){
        this.streetNum = street;
        this.city = ci;
        this.state = st;
        this.country = co;
    }
}

class StudentData{
    int rollNum;
    String studentName;
    Address studentAddress;
    StudentData(int roll, String name, Address addr){
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddress = addr;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address ad = new Address(212, "Karachi", "Sindh", "Pakistan");
        StudentData student = new StudentData(7, "Bilal", ad);
        System.out.println("Student Roll No Is : " + student.rollNum);
        System.out.println("Student Name Is : " + student.studentName);
        System.out.println("Student Street Number Is : " + ad.streetNum);
        System.out.println("Student City Is : " + ad.city);
        System.out.println("Student State Is : " + ad.state);
        System.out.println("Student Country Is : " + ad.country);
    }
}
