package Unit5;

class A
{
    A()
    {
        System.out.println("A");
    }

    public void show()
    {
        System.out.println("Show A");
    }
}

class B extends A
{
    B()
    {
        System.out.println("B");
    }
    public void show()
    {
        super.show();
        System.out.println("Show B");
    }
}

class C extends B
{
    C()
    {
        System.out.println("C");
    }
    public void show()
    {
        super.show();
        System.out.println("Show C");
    }    
}


public class ConstructorChaining
{
    public static void main(String[] args) {
        C c1 = new C();

        c1.show();
    }
}