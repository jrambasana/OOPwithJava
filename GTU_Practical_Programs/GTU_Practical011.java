/**
 * Write a program that generate 6*6 two-dimensional matrix,
 * filled with 0’s and 1’s , display the matrix, 
 * check every raw and column have an odd number’s of 1’s.
 */

package GTU_Practical_Programs;

public class GTU_Practical011 {
    public static void main(String[] args) {

		int[][] arr = new int[6][6];
		System.out.println("New matrix:");
		printArray(arr);

		for(int i=0;i<arr.length-1;i++) 
		{
			int cnt=0;
			for(int j=0;j<arr[i].length-1;j++) {
				arr[i][j]=(int)(Math.random()*2);
				cnt+=arr[i][j];
			}
			if(cnt%2==0) {
				arr[i][arr[i].length-1]=1;
			}
		}
		
		for(int j=0;j<6;j++) {
			int cnt=0;
			for(int i=0;i<6;i++) {
				cnt+=arr[i][j];
			}
			if(cnt%2==0) {
				arr[arr.length-1][j]=1;
			}
		}
		System.out.println("Matrix with odd no of 1's in row n column:");
		printArray(arr);
	}
	public static void printArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}}
