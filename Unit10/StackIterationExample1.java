import java.util.Iterator;  
import java.util.Stack;  
public class StackIterationExample1   
{     
public static void main (String[] args)   
{   
    //creating an object of Stack class  
    Stack stk = new Stack();  
    //pushing elements into stack  
    stk.push("BMW");  
    stk.push("Audi");  
    stk.push("Ferrari");  
    stk.push("Bugatti");  
    stk.push("Jaguar");  

    // Checks the Stack is empty or not  
    boolean rslt = stk.empty();  
    System.out.println("Is the stack empty or not? " +rslt);  
    // Find the size of the Stack  
    int x = stk.size();  
    System.out.println("The stack size is: "+x);  

    //iteration over the stack  
    Iterator iterator = stk.iterator();  
    while(iterator.hasNext())  
    {  
        Object values = iterator.next();  
        System.out.println(values);   
    }     
}  
}  
