import java.util.*;  
public class LinkedHashMap3 {  
   public static void main(String args[]) {  
    Map<Integer,String> map=new LinkedHashMap<Integer,String>();        
     map.put(101,"Amit");    
     map.put(102,"Vijay");    
     map.put(103,"Rahul");    
     System.out.println("Before invoking remove() method: "+map);     
    map.remove(102);  
    System.out.println("After invoking remove() method: "+map);    
   }      
}  
