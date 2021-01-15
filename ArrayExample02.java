public class ArrayExample02 {
    public static void main(String[] args) {
        double myList[] = new double[10];
        for(double i : myList)
        {
            System.out.println("For Each: " + i);
        }
        for(double i=0 ; i < myList.length ; i++)
        {
            System.out.println("Simple For: " + i);
        }
    }
}
