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
            case 7:
            case 8:
            case 10:
            case 12:
                    days = 31;
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                    days = 30;
                    break;
            case 2:
                    days = 28;
                    break;
        }

        System.out.println("The number of days : " + days);
                
        input.close();
    }
}
