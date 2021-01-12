/**
 * Write a program that reads an integer and displays 
 * all its smallest factors in increasing order. 
 * For example if input number is 120, the output 
 * should be as follows:2,2,2,3,5.
 *
 */

package GTU_Practical_Programs;

import java.util.Scanner;
public class GTU_Practical008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("enter the number :");
		int a = input.nextInt();
		System.out.println("Factors of "+ a + " are :");
		
//		for(int i=1;i<=a;i++)
//			if(a%i==0)
//				System.out.print(i+",");
				
		for(int i=2;a>1;)
		{
			if(a%i==0)
			{
				System.out.print(i+",");
				a/=i;
			}
			else
			{
				i++;
			}
		}
		        
        input.close();
	}

}

