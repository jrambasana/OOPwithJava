package Unit5;


class A1{
    int i,j;
    A1(int a, int b)
    {
        i = a;
        j = b;
    }
    void show()
    {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}
class B1 extends A1{
    int k;
    B1(int a, int b, int c)
    {
        super(a, b);
        k = c;
    }
    void show()
    {
        super.show();
        System.out.println("Value of k: " + k);
    }
}
public class OverRidingEx1 {
    public static void main(String[] args) {
        B1 b = new B1(4,5,6);
        b.show();
    }
}
