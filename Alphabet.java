import java.util.Scanner;
class Alphabet{
	public static void main(String[] args){
		System.out.println("Enter the letter: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch== 'o'||ch=='u'){
			System.out.println(ch +": entered letter is vowel.");
		}else if(ch=='A'|| ch=='E'|| ch=='I'|| ch== 'O'||ch=='U'){
			System.out.println(ch +": entered letter is vowel.");
		} else 
		    System.out.println(ch + ": entered letter is consonant");
	}
}
