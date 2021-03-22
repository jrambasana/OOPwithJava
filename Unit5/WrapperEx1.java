package Unit5;

public class WrapperEx1 {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer i = Integer.valueOf(2147483647);

        System.out.println(i);

        int j = i.intValue() - 1;
        System.out.println(j);
        
        Integer k = Integer.parseInt("2147483647");
        System.out.println(k);

    } 
}
