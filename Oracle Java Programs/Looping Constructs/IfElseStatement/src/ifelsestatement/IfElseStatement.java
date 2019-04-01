/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsestatement;

/**
 *
 * @author Bilal
 */
public class IfElseStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score = 76;
        char grade = 0;
        if(score >= 90)
        {
            grade = 'A';
        }
        else if(score >= 80)
        {
            grade = 'B';
        }
        else if(score >= 70)
        {
            grade = 'C';
        }
        else if(score >= 60)
        {
            grade = 'D';
        }
        else if(score >=50)
        {
            grade = 'E';
        }
        System.out.println("Grade:" + grade);
    }
    
}
