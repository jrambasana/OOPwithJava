import java.util.Scanner;

public class ArrayVariableLenArgList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i < n ; i++)
        {
            System.out.print("\nEnter a number: ");
            arr[i] = input.nextInt();
        }

        System.out.println("The maximum  number is: "+ max(arr));
        System.out.println("The maximum  number is: "+ max(44, 55, 66));
        
        input.close();        
    }

    public static int max(int... arr)
    {
        int result = arr[0];

        for(int i = 1 ; i < arr.length ; i++)
        {
            if (result < arr[i])
                result = arr[i];
        }

        return result; 
    }
}
