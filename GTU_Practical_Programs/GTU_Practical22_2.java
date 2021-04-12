package GTU_Practical_Programs;
/*
* Program - 22_2
* Write a test program that prompts the user 
* to enter an integer and display its product. 
*/

import java.util.Scanner;

public class GTU_Practical22_2
{
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  int product=1;
  System.out.print("Enter an integer: ");
  int n = input.nextInt();
  int n2 = n;
  while (n>0) 
  {
      int temp = n%10;   
      if (temp != 0)
          product *= temp;
      n = n / 10;
  }
  System.out.println("Product of the digits of the no: "+n2 +" is: "+product);  
 }
}   
