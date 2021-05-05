import java.util.Stack;  
public class StackSearchMethodExample  
{  
public static void main(String[] args)   
{  
Stack<String> stk= new Stack<>();  
//pushing elements into Stack  
stk.push("Mac Book");  
stk.push("HP");  
stk.push("DELL");  
stk.push("Asus");  
System.out.println("Stack: " + stk);  
// Search an element  
int location = stk.search("Asus");  
System.out.println("Location of Asus is: " + location);  
}  
}  
