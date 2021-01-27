public class ArrayReverseExample01 {
    public static void main(String[] args) {
        // Array Declaration
        int[] sourceArray = {2, 3, 1, 5, 10, 4, 7, 6};

        // Display the array
        System.out.println("Source Array before reversing: ");
        for(int i:sourceArray)
            System.out.print(i + " ");
        
        sourceArray = reverse(sourceArray);

        System.out.println("\n Array after reversing: ");
            for(int i:sourceArray)
                System.out.print(i + " ");
    }

    public static int[] reverse(int[] list)
    {
        int [] result = new int[list.length];

        for( int i=0, j=list.length-1; i < list.length ; i++, j-- )
        {
            result[j] = list[i];
        }

        return result;
    }
}
