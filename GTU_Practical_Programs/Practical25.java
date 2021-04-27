package GTU_Practical_Programs;

import java.io.*;
import java.security.InvalidParameterException;
import java.util.*;

/* 
* Program - 25
* Write a program that reads words from a 
* text file and displays all the nonduplicate 
* words in descending order. The text file is 
* passed as a command-line argument.
*/

public class Practical25
{
 public static void main(String[] args) throws FileNotFoundException 
 {
    if (args.length != 1)
        throw new InvalidParameterException("Usage: fullFilePathName");
    File file = new File(args[0]);
    if (!file.isFile())
            throw new FileNotFoundException(file + " is not a file.");
    try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 10000)) 
    {
        String inputS;
        StringBuilder sb = new StringBuilder(10000);
        while ((inputS = in.readLine()) != null)
            sb.append(inputS);

        String[] words = sb.toString().split("\\s+");
        TreeSet<String> ndWords = new TreeSet<>(Arrays.asList(words));
        Iterator<String> itr = ndWords.descendingIterator(); 
        String s;
        while (itr.hasNext()) 
        { 
            s = itr.next(); 
            System.out.println(s);
        } 
    }
    catch (IOException e) 
    {
            e.printStackTrace();
            System.exit(0);
    }
 }
}
