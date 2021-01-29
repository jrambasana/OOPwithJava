package Unit4;

class Circle {
    double radius;
    Circle ()
    {
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
        System.out.println("Circle 1 area is: " + c1.getArea());
        c1.setRadius(5);
        System.out.println("Circle 1 area is: " + c1.getArea());
        System.out.println("Circle 2 area is: " + c2.getArea());
    }
}
