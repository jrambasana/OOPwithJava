import java.util.*;  
class ArrayList4{  
 public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    list.add("Ravi");//Adding object in arraylist  
    list.add("Vijay");  
    list.add("Ravi");  
    list.add("Ajay");  
    System.out.println("Traversing using Iterator in Fwd order:");  
    //Traversing list through Iterator  
    Iterator itr = list.iterator();//getting the Iterator 
    
    while(itr.hasNext()){//check if iterator has the elements  
    System.out.println(itr.next());//printing the element and move to next  
    }

    System.out.println("Traversing using ListIterator in Reverse order:");  
    //Here, element iterates in reverse order  
      ListIterator<String> list1 = list.listIterator(list.size());  
      while(list1.hasPrevious())  
      {  
          String str=list1.previous();  
          System.out.println(str);  
      }  

      System.out.println("Traversing list through for loop (index):");  
      for(int i=0;i<list.size();i++)  
      {  
        System.out.println(list.get(i));     
      }  
            
      System.out.println("Traversing list through forEach() method:");  
      //The forEach() method is a new feature, introduced in Java 8.  
      list.forEach(a->{ //Here, we are using lambda expression  
          System.out.println(a);  
        });  
              
      System.out.println("Traversing list through forEachRemaining() method:");  
      Iterator<String> itr2=list.iterator();  
      itr2.forEachRemaining(a-> //Here, we are using lambda expression  
      {  
        System.out.println(a);  
      });  
 }  
}  