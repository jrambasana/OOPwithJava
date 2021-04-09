package Unit10;

import java.io.*;
import java.util.Scanner;

public class BufferedExample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter your name: ");  
        String name = br.readLine(); 
        System.out.print("Welcome "+name);

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name2 = input.nextLine();
        System.out.print("Welcome "+name2);
    }
}
