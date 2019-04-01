package documentationprogram3;

/**
* <h1>Add Two Numbers!</h1>
* The AddNum program implements an application that
* simply adds two given integer numbers and Prints
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Syed Bilal
* @version 1.0
* @since   2016-03-31  
*/

public class DocumentationProgram3 {
    /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param numA This is the first paramter to addNum method
   * @param numB  This is the second parameter to addNum method
   * @return int This returns sum of numA and numB.
   */
    public int addNum(int numA, int numB) 
    {
        return numA + numB;
    }
     /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */
    public static void main(String[] args) {
        DocumentationProgram3 obj = new DocumentationProgram3();
        int sum = obj.addNum(10, 20);
        System.out.println("Sum Of 10 & 20 Is :" + sum);

    }
}