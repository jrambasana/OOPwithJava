package Student_Programs;

import java.util.Scanner;

class Table
{
	public static void main(String[] args){
	System.out.println("Enter the number: ");
	Scanner in= new Scanner(System.in);
    int num= in.nextInt();
        for(int i= 1;i<=10;i++){
            System.out.println(num +" * "+ i + " = "+(num*i));
        }
            
    in.close();
    }
}
