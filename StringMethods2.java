public class StringMethods2 {
    public static void main(String args[])
    {
        // String s1 = "Welcome to Java";
        // String s2 = "Welcome to Java";
        // String s3 = "Welcome to C++";
        // String s4 = "Welcome to java";

        // System.out.println("Equals : " + s1.equals(s2));
        // System.out.println("Equals : " + s1.equals(s3));
        // System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase(s4));
       
        // System.out.println("CompareTo : " + s1.compareTo(s2));
        // System.out.println("CompareTo : " + s1.compareTo(s4));

        // System.out.println("Starts With Wel: " + s1.startsWith("Wel"));
        // System.out.println("Starts With wel: " + s1.startsWith("wel"));


        String message = "Welcome to Java";
        String msg = "c++ is Object oriented language";
        String s1 = message.substring(0, 11) + "HTML"; // Welcome to HTML
        String s2 = "java" + msg.substring(3);
        System.out.println(s1);
        System.out.println(s2);
    }
}
