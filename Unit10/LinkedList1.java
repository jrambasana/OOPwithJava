import java.util.*;  
public class LinkedList1{  
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter the names of Employees: ");
  String ch = "y";
  LinkedList<String> ll = new LinkedList<String>();  
  while(ch.equals("y"))
  {
    System.out.println("Enter the name: ");
    String name = input.next();
    ll.add(name);
    System.out.println("Do you want to continue (y/n): ");
    ch = input.next();
  }

//   ll.add("Ravi");  
//   ll.add("Vijay");  
//   ll.add("Ravi");  
//   ll.add("Ajay");  
System.out.println("The list of Employees: ");
  Iterator<String> itr =ll.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  