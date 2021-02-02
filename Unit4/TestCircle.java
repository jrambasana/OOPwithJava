package Unit4;

import java.util.Scanner;

class Circle {
    double radius;
    Circle ()
    {
        int radius=10;
        System.out.println(radius);
    }
    Circle (double d)
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
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10.5);
        Circle c3;
        System.out.println("Circle 1 area is: " + c1.getArea());
        c1.setRadius(5);
        System.out.println("Circle 1 area is: " + c1.getArea());
        System.out.println("Circle 2 area is: " + c2.getArea());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius for Circle 3: ");
        int r = input.nextInt();
        c3 = new Circle(r);
        System.out.println("Circle 3 area is: " + c3.getArea());
    }
}
