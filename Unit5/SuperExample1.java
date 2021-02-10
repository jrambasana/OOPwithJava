package Unit5;

class SuperClass{
    int x;
    SuperClass(){
        System.out.println("Super class no arg constructor called.");
    }
    SuperClass(int i){
        x = i;
        System.out.println("Super class parameterized constructor called.");
    }
    public void methodA()
    {
        System.out.println("Method A of Super class");
    }
}
class SubClass extends SuperClass{
    int y;
    SubClass(){
        System.out.println("Sub class no arg constructor called.");
    }
    SubClass(int i){
        super(i); 
        y = i;
        System.out.println("Sub class parameterized constructor called.");
    }
    public void methodA()
    {
        System.out.println("Method A of sub class");
        super.methodA();
    }
}

public class SuperExample1 {
    public static void main(String[] args) {
        SubClass su1 = new SubClass(10);
        // System.out.println(su1.x);
        // System.out.println(su1.y);    
        su1.methodA();    
    }
}
