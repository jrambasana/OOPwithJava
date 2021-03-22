package Unit4;

import java.util.Scanner;

class Circle2 {
    double radius;
    Circle2 ()
    {
        int radius=10;
        System.out.println(radius);
    }
    Circle2 (double d)
    {
        radius = d;
    }
    double getArea(){ 
        return (Math.PI * radius * radius);
    }
    double getPerimeter(){ 
        return (2 * Math.PI * radius);
    }
    void setRadius(double newRadius){ 
        radius = newRadius;
    }
}
public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(10.5);
        Circle2 c3;
        System.out.println("Circle2 1 area is: " + c1.getArea());
        c1.setRadius(5);
        System.out.println("Circle2 1 area is: " + c1.getArea());
        System.out.println("Circle2 2 area is: " + c2.getArea());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius for Circle2 3: ");
        int r = input.nextInt();
        c3 = new Circle2(r);
        System.out.println("Circle2 3 area is: " + c3.getArea());

        input.close();
    }
}
