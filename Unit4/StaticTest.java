package Unit4;

public class StaticTest {
    static int i;
    int j;
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println("Initially...");
        System.out.println("Static variable i = " + StaticTest.i);
        System.out.println("Instance variable j of st1 = " + st1.j);
        System.out.println("Instance variable j of st2 = " + st2.j);

        st1.j = 10;
        st2.j = 20;
        StaticTest.i  = 40;
        System.out.println("After assignment operation...");
        System.out.println("Static variable i = " + StaticTest.i);
        System.out.println("Instance variable j of st1 = " + st1.j);
        System.out.println("Instance variable j of st2 = " + st2.j);

        st1.i++;
        st2.i++;
        StaticTest.i++;
        System.out.println("\nAfter increment operation...");
        System.out.println("Static variable i = " + StaticTest.i);
    }
}
