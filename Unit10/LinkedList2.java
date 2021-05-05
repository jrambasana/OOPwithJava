import java.util.*;  
public class LinkedList2{  
 public static void main(String args[])
 {  
    LinkedList<String> ll1 = new LinkedList<String>();  
    System.out.println("Initial list of elements: "+ll1);  
    ll1.add("Ravi");  
    ll1.add("Vijay");  
    ll1.add("Ajay");  
    System.out.println("After invoking add(E e) method: "+ll1);  
    //Adding an element at the specific position  
    ll1.add(1, "Gaurav");  
    System.out.println("After invoking add(int index, E element) method: "+ll1);  
    
    LinkedList<String> ll2=new LinkedList<String>();  
    ll2.add("Sonoo");  
    ll2.add("Hanumat");  
    //Adding second list elements to the first list  
    ll1.addAll(ll2);  
    System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll1);  
    
    LinkedList<String> ll3=new LinkedList<String>();  
    ll3.add("John");  
    ll3.add("Rahul");  
    ll3.add("Yatin");  
    ll3.add("Jatin");  
    
    //Adding second list elements to the first list at specific position  
    ll1.addAll(2, ll3);  
    System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll1);  
    //Adding an element at the first position  
    ll1.addFirst("Lokesh");  
    System.out.println("After invoking addFirst(E e) method: "+ll1);  
    //Adding an element at the last position  
    ll1.addLast("Harsh");  
    System.out.println("After invoking addLast(E e) method: "+ll1);  
        
 }  
}  