

public class AmbiguousOverloading {
    
    public static void main(String[] args) {
        System.out.println(max(1,2));
    }
    public static int max(int n1, int n2)
    {
        if(n1>n2)
            return n1;
        else
            return n2;
    }
    public static double max(double n1, double n2)
    {
        if(n1>n2)
            return n1;
        else
            return n2;
    }
    public static int max(int n1, int n2, int n3)
    {
        if(n1>n2 && n1>n3)
            return n1;
        else if(n2>n1 && n2>n3)
                return n2;
             else
                return n3;

    }
    public static double max(double n1, double n2, double n3)
    {
        if(n1>n2 && n1>n3)
            return n1;
        else if(n2>n1 && n2>n3)
                return n2;
             else
                return n3;
    }
}
