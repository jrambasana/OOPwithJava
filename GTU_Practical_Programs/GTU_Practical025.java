package GTU_Practical_Programs;
import java.io.*;
import java.util.*;
/* 
* Program - 25
* Write a program that reads words from a text file and displays 
* all the nonduplicate words in descending order. The text file is 
* passed as a command-line argument.
*/
class GTU_Practical025 {
    public static void main(String[] args) {
        //   if(args.length==1){
        //   String fileName = args[0];
            String fileName = "C://list.txt";
            TreeSet<String> set = new TreeSet<>();
            File file = new File(fileName);
            try {
                Scanner s = new Scanner(file);
                while (s.hasNext()){
                    set.add(s.next());
                }
                System.out.println(set);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        // }
        // else{
        //     System.out.println("Please, Pass the File Name as Command Line Argument");
        // }
    }
}