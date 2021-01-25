/**
 * Write a test program that prompts the user 
 * to enter ten numbers, invoke a method 
 * to reverse the numbers, and display the numbers.
 * 
 */
package GTU_Practical_Programs;

import java.util.Scanner;

public class GTU_Practical010 {
	public static void main(String[] args) {
		int[] list = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 Numbers:");
		for (int i = 0; i < list.length; i++)
			list[i]=input.nextInt();

		System.out.println("\nOriginal Array:");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		reverse(list);
		System.out.println("\nReveresed Array:");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
	public static void reverse(int[] list) {
		for (int i = 0; i < list.length/2; i++){
			int temp = list[i];
			list[i] = list[list.length-1-i];
			list[list.length-1-i] = temp;
			// list[i]=list[i]+list[list.length-1-i];
			// list[list.length-1-i]=list[i]-list[list.length-1-i];
			// list[i]=list[i]-list[list.length-1-i];
		}
	}

}
