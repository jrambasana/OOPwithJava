/**
 * Assume a vehicle plate number consists of 
 * three uppercase letters followed by four digits. 
 * Write a program to generate a plate number.
 *
 */
package GTU_Practical_Programs;

 public class GTU_Practical007 {
    public static void main(String[] args) {
		
		String numberPlate = ""+(char)(Math.random()*26+65);
		numberPlate += (char)(Math.random()*26+65);
		numberPlate += (char)(Math.random()*26+65);
		
		String digits = (""+ Math.random()).substring(3, 7);
		System.out.println("Generated number plate value is: " 
							+ numberPlate + " " +digits);		

//		numberPlate += (int)(Math.random()*10);
//		numberPlate += (int)(Math.random()*10);
//		numberPlate += (int)(Math.random()*10);
//		numberPlate += (int)(Math.random()*10);
		
//		double num = Math.random();
//		System.out.println(num);
//		String str = ""+num;
//		System.out.println(str);
//		System.out.println(subStr);
	}
}
