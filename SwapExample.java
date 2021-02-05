import java.util.Scanner;

public class SwapExample {
    int a, b;
    SwapExample(int x, int y)
    {
        a = x;
        b = y;
    }
    void swap()
    {
        // int temp = a;
        // a = b;
        // b = temp;
        a = a + b;
        b = a - b;
        a = a - b;
    }
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter number 1: ");
        m = input.nextInt();

        System.out.print("\nEnter number 2: ");
        n = input.nextInt();

        SwapExample s1 = new SwapExample(m,n);

        System.out.print("\nBefore Swapping");
        System.out.print("\n A = " + s1.a);
        System.out.print("\n B = " + s1.b);

        s1.swap();

        System.out.print("\nAfter Swapping");
        System.out.print("\n A = " + s1.a);
        System.out.print("\n B = " + s1.b);
    }
}
