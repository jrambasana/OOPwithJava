import java.util.*;  
class HashSet4{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();  
  list.add("Ravi");  
  list.add("Vijay");  
  list.add("Ajay");  
  list.add("Ravi");  
  System.out.println("The List: ");
  Iterator<String> i = list.iterator();  
  while(i.hasNext())  
  {  
    System.out.println(i.next());  
  }  
             
  HashSet<String> set=new HashSet(list);  
  set.add("Gaurav");  
  System.out.println("The Set: ");
  i=set.iterator();  
  while(i.hasNext())  
  {  
    System.out.println(i.next());  
  }  
 }  
}  
