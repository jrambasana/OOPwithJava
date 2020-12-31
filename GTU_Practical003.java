/**
 * Problem Statement: 
 * Write a program that reads a number in meters, 
 * converts it to feet, and displays the result.
 * (Hint: 1 metre = 3.28084 feet)
 */

import java.util.Scanner;

public class GTU_Practical003 {
	public static void main(String[] args) {
		System.out.print("Enter the value in Meters: ");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double feet=num*3.28084;
		System.out.println("The corresponsing value in Feets: " +feet);
	}

}