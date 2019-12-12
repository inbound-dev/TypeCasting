/*
 * This program askes User For input then Converts it
 * 
 * 
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
        
        // Create A Scanner Obj
        Scanner Input = new Scanner(System.in);
        
        // #1
        System.out.println("Please Enter A Whole Number");       
        int wholeNum = Input.nextInt();
        
        // #2
        System.out.println("Please Enter A Decimal Number");
        double decimal =  Input.nextDouble();
        
        // #3
        System.out.println("Please Enter A Single Character");
        char Character = Input.next().charAt(0);
        
        // #4
        System.out.println("Please Enter A Name");
        String Name = Input.next();
        
        // #5
        System.out.println("Please Enter A Whole Number");
        String WholeNumString = Input.next();
        
        // #6
        System.out.println("Please Enter A Decimal Number");
        String DecNumString = Input.next();
        
        // Conversion of all 
        
        // Convert Integer to Double 
        Double ConvWN = Double.valueOf(wholeNum); 
        
        // Convert Double to Integer
        int ConvDouble = (int)decimal;
        
        // Convert char to String
        String Convchar = String.valueOf(Character);
        
        // Convert First Letter Of Name Into char
        char ConvName = Name.charAt(0);
        
        // Convert NumString to int
        int ConvNumString = Integer.valueOf(WholeNumString);
        
        // Convert Decimal String to Double
        double ConvDecimalString = Double.valueOf(DecNumString);
        
        // Add A Space
        System.out.println("");
        
        // Prints All after Conversion
        System.out.println("You Entered " + ConvWN);
        System.out.println("You Entered " + ConvDouble);
        System.out.println("You Entered " + Convchar);
        System.out.println("You Entered " + ConvName);
        System.out.println("You Entered " + ConvNumString);
        System.out.println("You Entered " + ConvDecimalString); 
    }
}
