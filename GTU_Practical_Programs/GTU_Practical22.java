package GTU_Practical_Programs;
/*
* Program - 22
* Write a recursive method that returns the smallest integer 
* in an array. 
*/

import java.util.Scanner;

public class GTU_Practical22
{
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter five integers: ");
  int[] list = new int[5]; 
  int product = 1;

  for (int i = 0; i < list.length; i++) 
  {
   list[i] = input.nextInt();
   product *= list[i];
  }

  System.out.println("The smallest element from all the elements is: "
                     + min1(list));
  System.out.println("The Product of all the elements is: " + product);
 }


 public static int min1(int[] list) 
 {
  int min = list[list.length - 1];
  int index = list.length - 1;
  return min2(list, index, min);
 }

 private static int min2(int[] list, int index, int min) 
 {
  if (index < 0)
  {
   return min;
  }
  else if (list[index] < min) 
  { 
   return min2(list, index - 1, list[index]);
  }
  else
  {
   return min2(list, index - 1, min);
  }
 }
}   