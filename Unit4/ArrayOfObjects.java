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
public class ArrayOfObjects {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for(int i = 0 ; i < circles.length ; i++)
        {
            circles[i] = new Circle(i+1);
        }
        for(int i = 0 ; i < circles.length ; i++)
        {
            System.out.println("Area of Circle "+ (i+1) 
            + " : " + circles[i].getArea());
        }
    }
}
