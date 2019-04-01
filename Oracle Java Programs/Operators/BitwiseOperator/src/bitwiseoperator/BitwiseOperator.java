/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseoperator;

/**
 *
 * @author Bilal
 */
public class BitwiseOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bitmask = 0x000F;
        int value = 0x2222;
        System.out.println(value & bitmask);   
    }
    
}
