/**
 * Problem Statement:
 * Write a program that prompts the user to enter 
 * a letter and check whether a letter is a vowel or consonant.
 */

package GTU_Practical_Programs;

import java.util.Scanner;

public class GTU_Practical006 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a character:");
		char ch = input.next().charAt(0);
		
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(ch + " - It is a Vowel.");
				break;
			default:
				System.out.println(ch + " - It is Consonant.");
		}
		
		        
        input.close();
	}
}
