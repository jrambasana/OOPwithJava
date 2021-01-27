import java.util.*;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i < n ; i++)
        {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("\nEnter a key to search in the array: ");
        int key = input.nextInt();
        int index = binarySearch(arr, key);

        System.out.print("Array elements are: ");
        for(int i=0 ; i < n ; i++)
        {           
            System.out.print(arr[i] + " ");
        }
        
        if (index == -1)
            System.out.println("The key: " + key + " was not found in the array.");
        else
            System.out.println("The key: " + key + " was found on location: " + index);
        input.close();
    }

    public static int binarySearch(int[] list, int key)
    {
        int low = 0, high = list.length - 1;

        while(high > low)
        {
            int mid = (low + high) / 2;
            if ( key < list[mid] )
                high = mid - 1;
            else if ( key == list[mid] )
                    return mid;
                else
                    low = mid + 1;
        }
        return -1;
    }
}
