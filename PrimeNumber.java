import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
	int num, flag= 0;
	System.out.println("Enter the number: ");
	Scanner sc= new Scanner(System.in);
    num = sc.nextInt();
    for(int i=2; i<num/2; ++i){
    if(num%i==0){
    flag = 1;
    break;
            }
        }
        if(num==1){
        System.out.println("Neither prime nor composite.");
        } else if(flag == 0){
        System.out.println(num +" is prime number.");
        } else
        System.out.println(num + " is not a prime number.");

	}
}
