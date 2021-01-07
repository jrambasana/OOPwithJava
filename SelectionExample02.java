/**
 * Problem statement: Write a program to display 
 * number of days of given month by user  (Switch case).
 * NOTE: To be completed by students.
 */
import java.util.Scanner;

public class SelectionExample02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number: ");
        int n = input.nextInt();
        int days = 0;
        switch(n)
        {
            case 1:
            case 3:
            case 5:
                    days = 31;
            case 4:
            case 6:
            case 8:
                    days = 30;
        }

        System.out.println("The number of days : " + days);
    }
}
