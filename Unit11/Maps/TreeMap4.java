import java.util.*;  
class TreeMap4{  
 public static void main(String args[]){  
   SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
      //Returns key-value pairs whose keys are less than the specified key.  
      System.out.println("headMap: "+map.headMap(102));  
      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
      System.out.println("tailMap: "+map.tailMap(102));  
      //Returns key-value pairs exists in between the specified key.  
      System.out.println("subMap: "+map.subMap(100, 102));    
 }  
}  
