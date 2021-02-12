package Unit4;
class MyCount{
    int id=0;
    MyCount()
    {   id++;       }
    public String toString()
    {
        return "Id of this object is: "+id;
    }
}
public class ToStringExample {
    public static void main(String[] args) {
        MyCount c1 = new MyCount();
        System.out.println(c1);
        c1.id = 10;
        System.out.println(c1);
        String str1 = c1 + "";
        System.out.println(str1);
    }
}
