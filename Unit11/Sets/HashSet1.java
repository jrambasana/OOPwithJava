package Sets;

import java.util.*;  
class HashSet1
{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
    set.add("One");    
    set.add("Two");    
    set.add("Three");   
    set.add("Four");  
    set.add("Five");  
    set.add("One"); 
    Iterator<String> i=set.iterator();  
    while(i.hasNext())  
    {  
      System.out.println(i.next());  
    }  
 }  
}  