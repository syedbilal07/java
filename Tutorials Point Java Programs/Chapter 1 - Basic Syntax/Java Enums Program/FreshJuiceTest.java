/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshjuicetest;

/**
 *
 * @author Bilal
 */
class FreshJuice{
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE};
    FreshJuiceSize size;
}
public class FreshJuiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("The Size Of Juice Is " + juice.size);
    }
    
}
