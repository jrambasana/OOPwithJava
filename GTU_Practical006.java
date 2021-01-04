/**
 * Problem Statement:
 * Write a program that prompts the user to enter 
 * a letter and check whether a letter is a vowel or constant.
 */
import java.util.Scanner;
public class GTU_Practical006 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a character to check:");
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
				System.out.println("It is Vowel.");
				break;
			default:
				System.out.println("It is Constant.");
		}
		
		
	}

}
