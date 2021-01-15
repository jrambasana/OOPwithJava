public class ArrayCopyExample02 {
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
                        
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        System.out.println("\nTarget Array after copying: ");
            for(int i:targetArray)
                System.out.print(i + " ");
    }
}
