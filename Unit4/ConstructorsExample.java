package Unit4;

class A1{
    int i=5;
    A1(){
        this(10);
        System.out.println("A1 no arg constructor called " + i);
    }
    A1(int i){
        this.i = i;
        System.out.println("A1 parameterized constructor called " + i);
    }
}
class B1 extends A1{
    int i=5;
    B1(){
        super();
        System.out.println("B1 no arg constructor called.");
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        B1 a1 = new B1();
    }
}
