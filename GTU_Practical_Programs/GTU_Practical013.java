/**
 * Write a program for calculator to accept an expression 
 * as a string in which the operands and operator are 
 * separated by zero or more spaces.
 * For ex: 3+4 and 3 + 4 are acceptable expressions.
 * 
 */
package GTU_Practical_Programs;

import java.util.Scanner;
public class GTU_Practical013 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter valid expression: ");
		String exp = input.nextLine();
		
		System.out.println("Given expression: "+exp);
		
		double a=0;
		double b=0;
		double ans=0;
		char op = '1';
		
		//================================
//		char[] operators = {'+','-','*','/'};
//		for(int i=0;i<operators.length;i++) {
//			if(exp.indexOf(operators[i])!=-1) {
//				op = operators[i];
//			}
//		}
//		a = Double.parseDouble(exp.substring(0,exp.indexOf(op)));
//		b = Double.parseDouble(exp.substring(exp.indexOf(op)+1,exp.length()));
		//================================
		String[] oprnds = exp.split("[\\+\\-\\*\\/]");
		a = Double.parseDouble(oprnds[0]);
		b = Double.parseDouble(oprnds[1]);
		op = exp.charAt(oprnds[0].length());
		//================================
		switch(op) {
			case '+':ans=a+b;
			break;
			case '-':ans=a-b;
			break;
			case '*':ans=a*b;
			break;
			case '/':ans=a/b;
			break;
		}
		System.out.println("Answer: "+ans);
	}

}
