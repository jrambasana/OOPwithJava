package Unit4;

class Circle {
    double radius = 1; /** The radius of this circle */
    double getArea(){ /** Return the area of this circle */
        return Math.PI * radius * radius;
    }
    double getPerimeter(){ /** Return the perimeter */
        return 2 * Math.PI * radius;
    }
    void setRadius(double newRadius){ /** Set new radius */
        radius = newRadius;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setRadius(10);

        System.out.println("Circle area is: " + c1.getArea());
        System.out.println("Circle perimeter is: " + c1.getPerimeter());
    }
}
