package Unit6;

import java.net.MalformedURLException;
import java.io.IOException;

public class Exception01
{
    public static void method1() throws IOException
    {
        throw new IOException("My exception");
    }
    public static void main(String[] args) throws IOException  {
        System.out.println("Before method1");
        method1();
        System.out.println("After method1");
    }
}