/**
 * Problem Statement:
 * Write a program that prompts the user to enter a number 
 * and prints the Multiplication table upto number n.
 * Also read the value of n from user.
 * @author Raj Kumar
 */
package Student_Programs;

import java.util.Scanner;
public class Multiplication {
    public static void main(String [ ] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter multiplication table num : ");
        int num = input.nextInt();
        System.out.print("Enter number up to you want the table to extend to : ");
        int n = input.nextInt();
        for(int i = 1;i <= n; i++)
        {
          System.out.println( num + " X " + i+ " = " +(num*i));
        }
                
        input.close();
    }
}
