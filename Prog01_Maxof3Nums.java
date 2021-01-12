/**
 * Problkem statement:
 * Write a Java program to find the greatest out of 3 numbers entered by user.
 */
import java.util.Scanner;

public class Prog01_Maxof3Nums
{
    public static void main(String[] args)
    {	
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();
        
        if(  (num1 > num2) && (num1 > num3) )
        {
            System.out.print("Number 1 : " + num1 + " is the Greatest number.");
        } else  if( (num2 > num1) && (num2 > num3) )
                {
                    System.out.print("Number 2 : " + num2 + " is the Greatest number.");
                }
                else
                {
                    System.out.print("Number 3 : " + num3 + " is the Greatest number.");
                }                
                
        input.close();
    }
} 