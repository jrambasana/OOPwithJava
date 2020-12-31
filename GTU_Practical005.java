/**
 * Problem Statement:
 * Write a program that prompts the user to 
 * enter three integers and display the integers 
 * in decreasing order.
 *
 */

import java.util.Scanner;
public class GTU_Practical005 {

	public static void main(String[] args) {
		int i,j,arr[]= {0,0,0};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		for(i=0;i<3;i++)
			arr[i]=input.nextInt();
			
		for(i=0;i<3-1;i++)
			for(j=0;j<3-i-1;j++)
				if(arr[j]<arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
		
		System.out.println("Decreasing order:");
		for(i=0;i<3;i++)
			System.out.println(arr[i]);	
	}
}



