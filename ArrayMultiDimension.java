// import java.util.Scanner;

public class ArrayMultiDimension {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int[][] list = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5},
            {3, 4, 5},
            {4, 5},
            {5}
        };
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
