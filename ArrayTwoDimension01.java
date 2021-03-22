import java.util.Scanner;

public class ArrayTwoDimension01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list = new int[3][5];

        for(int i=0 ; i < list.length ; i++)
        {
            for(int j=0 ; j < list[i].length ; j++)
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
        input.close();
    }
}
