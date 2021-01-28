import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassExample01 {
    static Scanner input;
    public static void main(String[] args) 
    {
        input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i < n ; i++)
        {
            System.out.print(" Enter a number: ");
            arr[i] = input.nextInt();
        }

        // sort(arr);
        //search(arr);
        display(arr);
        Arrays.fill(arr, 10);
        display(arr);
    }

    public static void sort(int[] arr)
    {
        display(arr);
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        display(arr);
    }
    
    public static void search(int[] arr)
    {
        System.out.println("Enter the number to be searched: ");
        int n = input.nextInt();
        int index = -1;
        index = Arrays.binarySearch(arr, n);
        display(arr);
        if(index != -1)
            System.out.println("Number found on location: " + (index+1));
        else
            System.out.println("Number not found in the array");
    }

    public static void display(int[] arr)
    {
        System.out.print("Array: ");
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println("");
    } 
}
