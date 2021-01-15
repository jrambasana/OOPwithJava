public class ArrayCopyExample01 {
    public static void main(String[] args) {
        // Array Declaration
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray . length];

        // Display the array
        System.out.println("Source Array:");
        for(int i:sourceArray)
            System.out.print(i + " ");
        System.out.println("\nTarget Array before copying: ");
            for(int i:targetArray)
                System.out.print(i + " ");
    
        for (int i = 0; i < sourceArray.length; i++)
        {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("\nTarget Array after copying: ");
            for(int i:targetArray)
                System.out.print(i + " ");
    }
}
