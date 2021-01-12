package Student_Programs;

import java.util.Scanner;
class GradeWithMarks{
	public static void main(String[] args){
		System.out.println("Enter the marks: ");
		Scanner sc= new Scanner(System.in);
		int marks= sc.nextInt();
		if(marks<=100 && marks >=90){
			System.out.println("Grade obtained: A");
		}else if(marks < 90 && marks >=80){
			System.out.println("Grade obtained: B");
		}else if(marks < 80 && marks >=70){
			System.out.println("Grade obtained: C");
		}else if(marks < 70 && marks >=60){
			System.out.println("Grade obtained: D");
		}else 
		System.out.println("Grade obtained: E");
        
        sc.close();	
	}
	
}
