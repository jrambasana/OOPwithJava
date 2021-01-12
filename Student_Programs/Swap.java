import java.util.Scanner;
class Swap{
	static void swap(int n1, int n2){
	n1 =n1+n2;
    n2 =n1-n2;
    n1 =n1-n2;
    System.out.println("After Swapping n1 is "+ n1+ " and n2 is "+ n2);
	}
	public static void main(String[] args){
	    System.out.println("Enter two numbers: ");
	    Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
	    swap(num1,num2);	
	}
}
