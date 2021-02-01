/**
 * Write a program that creates a Random object with
 * seed 1000 and displays the first 100 random 
 * integers between 1 and 49 using the NextInt (49) method.
 * 
 */
package GTU_Practical_Programs;

import java.util.Arrays;
import java.util.Random;

public class GTU_Practical012 {
	public static void main(String[] args) {
		
		Random random = new Random(1000);
		
		for(int i=1;i<=100;i++) {
			System.out.printf("%3d",random.nextInt(98)+1);
			if(i%10==0)
				System.out.println();
		}
		
		// System.out.println(Arrays.toString((random.ints(100,1,49).toArray())));
		
	}

}