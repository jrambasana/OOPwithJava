/**
 * Problem statement:
 * Write a program that solves the following equation 
 * and displays the value of x and y:
 * 1) 3.4x+50.2y=44.5 
 * 2) 2.1x+.55y=5.9 
 * Assume Cramer’s rule to solve equation
 *  ax+by=e 
 *  cx+dy=f 
 *  x=ed-bf/ad-bc
 *  y=af-ec/ad-bc
 */

package GTU_Practical_Programs;

public class GTU_Practical002 
{
public static void main(String[] args) {
	System.out.println("Given System of Equations is:");
	System.out.println(" 1) 3.4x+50.2y=44.5 \n 2) 2.1x+.55y=5.9");
	double a=3.4,b=50.2,c=2.1,d=.55,e=44.5,f=5.9;
	double x=((e*d)-(b*f))/((a*d)-(b*c));
	double y=((a*f)-(e*c))/((a*d)-(b*c));
	System.out.println("Solution for the given system of equation:");
	System.out.println("X : "+x);
	System.out.println("Y : "+y);
    }
}
