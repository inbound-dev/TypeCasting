/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package typecasting;
import java.util.Scanner;

/**
 *
 * @author joham3169
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please Enter A Whole Number");
        
        int wholeNumber = Input.nextInt();
        
        System.out.println("Please Enter A Decimal Number");
        
        Double Decimal = Input.nextDouble();
        
        System.out.println("Please Enter A Single Character");
        
        String Char  = String.valueOf(Input);
        
        System.out.println("Please Enter A Whole Number");
        
        String WN;
        
        System.out.println("Please enter A Name");
        
        String Name = Input.next();
        
        System.out.println("Please Enter A Decimal Number");
        
        String DecimalNum = String.valueOf(Input);
    }
    
}
