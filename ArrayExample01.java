import java.util.Scanner;

public class ArrayExample01 {
    public static void main(String[] args) {
        double[] arr = new double[10];

        Scanner input = new Scanner(System.in);
        
        for( int i = 0; i < arr.length ; i++ )
        {
            System.out.print("Enter a number of location " + i +": ");
            arr[i] = input.nextDouble();
        }

        System.out.print("Array elements:");
        for( int i = 0; i < arr.length ; i++ )
        {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
    
}
