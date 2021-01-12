/**
 * Problem statement: 
 * Write a program to find the user given number 
 * is odd or even number (Two way if-else).
 */
import java.util.Scanner;

public class SelectionExample01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();

        if( n/2 == 0 )
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
                
        input.close();
    }
}
