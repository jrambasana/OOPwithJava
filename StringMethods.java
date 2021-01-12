import java.util.Scanner;
public class StringMethods {
    public static void main(String args[])
    {
        System.out.print("Enter a String: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println("Length : " + str.length());
        System.out.println("Character at location 2: " + str.charAt(2) );
        System.out.println("Concated with other string:" + str.concat(" abcd"));
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("To lower case: " + str.toLowerCase()); 
        System.out.println("Trimmed string: " + str.trim());
                
        in.close();
    }
}
