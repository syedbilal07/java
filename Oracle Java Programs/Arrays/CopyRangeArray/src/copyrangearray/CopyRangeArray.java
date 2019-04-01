/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyrangearray;

/**
 *
 * @author Bilal
 */
public class CopyRangeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);    
        System.out.println(new String(copyTo));
    }
    
}
