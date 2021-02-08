package Unit4;

class SimpleCircle
{
    private double radius;
    private static int count = 0;

    SimpleCircle()
    {
        count++;
    }
    SimpleCircle(double d)
    {
        radius = d;
        count++;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double d)
    {
        radius = d;
    }
    public static int getCount()
    {
        return count;
    }
    public double getArea()
    {
        return (3.14*radius*radius);
    }
}

public class TestCircleCount {
    public static void main(String[] args) {
        System.out.println("Total circle objects created: " 
                            + SimpleCircle.getCount() );

        SimpleCircle c1 = new SimpleCircle();
        SimpleCircle c2 = new SimpleCircle(5.5);

        c1.setRadius(3.5);
        System.out.println("C1 circle radius = " + c1.getRadius());
        System.out.println("C1 circle area   = " + c1.getArea());
        System.out.println("C2 circle radius = " + c2.getRadius());
        System.out.println("C2 circle area   = " + c2.getArea());

        System.out.println("Total circle objects created: " 
                            + SimpleCircle.getCount() );
    }
}
