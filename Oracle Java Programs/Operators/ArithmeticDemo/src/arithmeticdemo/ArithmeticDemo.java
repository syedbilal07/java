/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticdemo;

/**
 *
 * @author Bilal
 */
public class ArithmeticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int original_result = result;
        
        result = result - 1;
        System.out.println(original_result + " - 1 =  " + result);
        original_result = result;
        
        result = result * 2;
        System.out.println(original_result + " * 2 =  " + result);
        original_result = result;
        
        result = result / 2;
        System.out.println(original_result + " / 2 =  " + result);
        original_result = result;
        
        result = result + 8;
        System.out.println(original_result + " + 8 =  " + result);
        original_result = result;
        
        result = result % 7;
        System.out.println(original_result + " % 7 =  " + result);
        original_result = result;
    }
    
}
