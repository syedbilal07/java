package serializationanddeserialization;
import java.io.*;
/*
    I Cannot Serialize & Deserialize Employee In Two Different Projects Because If I Copy Serialized "employee.ser" Into Deserialization
    Directory. The Byte Codes Will Be Changed And Data Cannot Be Deserialized Or Read. So, I Have Did Both Things In One File Otherwise
    A Class Not Found Exception Would Occur. 
    Another Thing, The Value Of SSN After Deserializing Changed To 0 Because This Variable Was Transient And Was Not Serialized, So The
    Value Becomes 0.
*/
class Employee implements Serializable {
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck() 
   {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}

public class SerializationAndDeserialization {
    public static void main(String[] args) {
        // This Is Serialization.
        Employee e1 = new Employee();
        e1.name = "Reyan Ali";
        e1.address = "Phokka Kuan, Ambehta Peer";
        e1.SSN = 11122333;
        e1.number = 101;
        
        try
        {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e1);
            out.close();
            fileOut.close();
            System.out.printf("Serialized Data Is Saved In Main Directory Of This Program");
        }
        catch(IOException i) 
        {
            i.printStackTrace();
        }
        System.out.println("");
        // This Is Deserialization
        Employee e2 = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e2 = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(IOException i) 
        {
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c) 
        {
            System.out.println("Employee Class Not Found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employeee");
        System.out.println("Name : " + e2.name);
        System.out.println("Address : " + e2.address);
        System.out.println("SSN : " + e2.SSN);
        System.out.println("Number : " + e2.number);
    }
}