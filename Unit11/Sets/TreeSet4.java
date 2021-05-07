import java.util.*;  
class TreeSet4{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
        set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        System.out.println("Initial Set: "+set);  

        System.out.println("Reverse Set by set.descendingSet(): "+set.descendingSet());  

        System.out.println("Head Set by set.headSet(\"C\", true) : "+set.headSet("C", true));  

        System.out.println("SubSet by set.subSet(\"A\", false, \"E\", true) : "+set.subSet("A", false, "E", true));  

        System.out.println("TailSet set.tailSet(\"C\", true) : "+set.tailSet("C", true));  
 }  
}  

