import java.util.*;  
 class ArrayList5{  
 public static void main(String args[])
 {  
  //Creating user-defined class objects  
  Student s1=new Student(101,"ABC",23);  
  Student s2=new Student(102,"XYZ",21);  
  Student s3=new Student(103,"PQR",25);  
  //creating arraylist  
  ArrayList<Student> studentList=new ArrayList<Student>();  
  studentList.add(s1);//adding Student class object  
  studentList.add(s2);  
  studentList.add(s3);  
  //Getting Iterator  
  Iterator itr = studentList.iterator();  
  System.out.println("Student Details: ");
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st);
  }  
 }  
} 