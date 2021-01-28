import java.util.Scanner;

public class ArrayMultiDimension02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list;
        
        System.out.print("Enter the no of rows: ");
        int rows = input.nextInt();
        list = new int[rows][];

        for(int i=0 ; i < list.length ; i++)
        {
            System.out.print("\nEnter the no of columns for array no " + (i+1) + " : ");
            int columns = input.nextInt();
            list[i] = new int[columns];
            for(int j=0 ; j < columns ; j++)
            {
                System.out.print("Enter a number: ");
                list[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix is: ");
        for(int i=0 ; i < list.length ; i++)
        {
            for(int j=0 ; j < list[i].length ; j++)
            {
                System.out.print(list[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
