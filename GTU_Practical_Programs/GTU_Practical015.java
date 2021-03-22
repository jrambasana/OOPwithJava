package GTU_Practical_Programs;

/**
 * Write the bin2Dec (string binary String) method to convert a binary string 
 * into a decimal number. Implement the bin2Dec method to 
 * throw a NumberFormatException if the string is not a binary string.
 */

import java.util.Scanner;
public class GTU_Practical015 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a Binary Number: ");
		String binaryNumber = input.next();
		try {
			int decNumber = bin2Dec(binaryNumber);
			System.out.print("Decimal number: "+decNumber);
		} catch(NumberFormatException ex) {
			System.out.println("Exception occured: "+ex.getMessage());
		}
		input.close();
	}

	public static int bin2Dec(String binaryNumber) throws NumberFormatException {
		int result = 0;
		for(int i=0;i<binaryNumber.length();i++) 
		{
			char currBinVal = binaryNumber.charAt(binaryNumber.length()-i-1);
			if(currBinVal != '0' && currBinVal != '1')
				throw new NumberFormatException("Given number is not a binary number: " 
												+ binaryNumber);
			else if(currBinVal == '1')
				result = result + (int)Math.pow(2, i);
		}
		return result;
	}
}