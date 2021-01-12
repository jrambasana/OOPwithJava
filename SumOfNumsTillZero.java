import java.util.Scanner;

public class SumOfNumsTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0;
        do
        {
            System.out.print("\n Enter a number: ");
            n = input.nextInt();
            sum = sum + n;
        } while (n != 0);

        System.out.println("\n Sum of numbers entered: " + sum); 
                
        input.close();      
    }
}
