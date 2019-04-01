package thiskeyword;

public class ThisKeyword {
    // Instance variable num
    int num = 10;
    
    ThisKeyword()
    {
        System.out.println("This is an example program on keyword this");
    }
    ThisKeyword(int num)
    {
        // Invoking the default constructor
        this();
        // Assigning the local variable num to the instance variable num
        this.num = num;
    }
    public void greet() 
    {
        System.out.println("Hi Welcome to Tutorialspoint");
    }
    public void print() 
    {
        // Local variable num
        int num = 20;
      
        // Printing the local variable
        System.out.println("value of local variable num is : "+num);
      
        // Printing the instance  variable
        System.out.println("value of instance variable num is : "+this.num);
      
        // Invoking the greet method of a class
        this.greet();     
    }
    public static void main(String[] args) {
        // Instantiating the class
        ThisKeyword obj1 = new ThisKeyword();
        obj1.print();
        System.out.println();
        // Passing a new value to the num variable through parametrized constructor
        ThisKeyword obj2 = new ThisKeyword(30);
      
        // Invoking the print method again
        obj2.print(); 
    }
}