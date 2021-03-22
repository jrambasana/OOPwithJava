package GTU_Practical_Programs;

/**
 * Write a program that prompts the user to enter 
 * a decimal number and displays the number in a fraction.
 * Hint: Read the decimal number as a string, extract 
 * the integer part and fractional part from the string.
 */
import java.util.Scanner;

public class GTU_Practical016 
{
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a decimal number: ");
		String number = input.next();
		
		if(number.split("\\.").length!=2) {
			System.out.println("Given number is not a valid decimal number.");
			System.exit(0);
		}
		Rational rNum = new Rational(number);
		System.out.println("Number in a fraction: "
		+ rNum.getnumerator() + " / " + rNum.getDenominator());
        input.close();
    }

}

class Rational 
{
	private int numerator;
	private int denominator;
	
	Rational(String number){
		int decPos = number.indexOf('.');
		this.denominator = (int) Math.pow(10, number.length()-decPos-1);
		this.numerator=((int)(Double.parseDouble(number)*denominator));
		normalize();
	}
	Rational(int numerator, int denominator){
		this.setnumerator(numerator);
		this.setDenominator(denominator);
		normalize();
	}
	public int getnumerator() {
		return numerator;
	}
	public void setnumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	private int gcd(int num1,int num2) {
		int gcd = 1;
		for(int i=1;i<num1;i++) {
			if(num1%i == 0 && num2%i==0)
				gcd=i;
		}
		return gcd;
	}
	public void normalize() {
		int gcd = gcd(numerator,denominator);
		this.numerator = this.numerator/gcd;
		this.denominator = this.denominator/gcd;
	}
	
}