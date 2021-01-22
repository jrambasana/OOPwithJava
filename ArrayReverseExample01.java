public class ArrayReverseExample01 {
    public static void main(String[] args) {
        // Array Declaration
        int[] sourceArray = {2, 3, 1, 5, 10};

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
        return list;
    }
}
