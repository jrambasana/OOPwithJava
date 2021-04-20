import java.util.Scanner;
class PlateNumber{
	public static void main(String[] args){
		char[] arr = new char[3];
		char[] a = new char[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.next().charAt(0);
		String str = new String(arr);
		for(int i =0;i<a.length;i++)
			a[i] = sc.next().charAt(0);
		String str1 = new String(a);		
		System.out.println(str.toUpperCase() + str1);
	}
}
