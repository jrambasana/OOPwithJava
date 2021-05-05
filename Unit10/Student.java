class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
  public String toString()
  {
    return "\n Rollno: " + rollno + " Name: " + name + " Age: " + age;
  }
}  