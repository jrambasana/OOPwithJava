package Unit4;

class MyCount{
    int count=0;
    MyCount()
    {   count++;       }
    public String toString()
    {
        return "Count is: "+count;
    }
}
public class ToStringExample {
    public static void main(String[] args) {
        MyCount c1 = new MyCount();
        System.out.println(c1);

        c1.count = 10;
        System.out.println("New output: " + c1.toString());
    }
}
