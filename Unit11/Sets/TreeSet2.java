import java.util.*;  
class TreeSet2{  
 public static void main(String args[]){  
 TreeSet<String> set=new TreeSet<String>();  
    set.add("Ravi");  
    set.add("Vijay");  
    set.add("Ajay");  
    System.out.println("Traversing element through Iterator in natural order");  
    Iterator<String> itr=set.iterator();  
    while(itr.hasNext()){  
     System.out.println(itr.next());  
    }      
    System.out.println("Traversing element through Iterator in descending order");  
    Iterator i=set.descendingIterator();  
    while(i.hasNext())  
    {  
        System.out.println(i.next());  
    }  
           
 }  
}  
