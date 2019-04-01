/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparison;

/**
 *
 * @author Bilal
 */
public class Comparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("Value 1 Is Equal To Value 2");
        if(value1 != value2)
            System.out.println("Value 1 Is Not Equal To Value 2");
        if(value1 > value2)
            System.out.println("Value 1 Is Greater Than Value 2");
        if(value1 < value2)
            System.out.println("Value 1 Is Less Than Value 2");
    }
    
}

