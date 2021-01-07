import java.util.Scanner;
class BMI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println(bmi);
        if(bmi < 18.5){
        	System.out.println("Underweight");
        } else if(bmi<25.0 && bmi>=18.5){
        	System.out.println("Normal");
        } else if(bmi<30.0 && bmi>= 25.0){
        	System.out.println("overweight");
        }else 
        System.out.println("obese");
    }
}
