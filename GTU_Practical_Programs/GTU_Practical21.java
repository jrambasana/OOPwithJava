package GTU_Practical_Programs;
/*
* Program - 21
* Write a program to create a file name 123.txt, 
* if it does not exist. Append a new data to it if it already exists.  
* Write  150  integers created randomly into the file using Text  I/O. 
* Integers are separated by space.
*/

import java.io.*;

public class GTU_Practical21 
{
public static void main(String[] args) 
 {
   try (
      PrintWriter pw = new PrintWriter(new FileOutputStream(new File("123.txt"), true));
   ) 
   {
      pw.println("******************");
      for (int i = 0; i < 150; i++) 
         pw.print((int)(Math.random() * 150) + " ");
      pw.println("\n******************");
   } 
   catch (FileNotFoundException e) 
   {
      System.out.println("Cannot create the file.");
      e.printStackTrace();
   }
  }
}

