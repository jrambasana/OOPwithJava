import java.util.Date;
public class ComparableTest {
    public static void main(String[] args) {
        System.out.println("abc".compareTo("abf"));
        System.out.println(new Integer(5).compareTo(new Integer(3)));
        Date d1 = new Date(2013,1,1);
        Date d2 = new Date(2012,1,1);
        System.out.println(d1.compareTo(d2));
        System.out.println(d2.compareTo(d1));
        
    }
}
