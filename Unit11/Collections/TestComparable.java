//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface  
import java.util.*;  
import java.io.*;  
class Student1 implements Comparable<Student1>{  
    int rollno;  
    String name;  
    int age;  
    Student1(int rollno,String name,int age){  
        this.rollno=rollno;  
        this.name=name;  
        this.age=age;  
    }  
    public int compareTo(Student1 st){  
        if(age==st.age)  
            return 0;  
        else if(age>st.age)  
            return 1;  
        else  
            return -1;  
    }  
}  
//Creating a test class to sort the elements  
public class TestComparable{  
public static void main(String args[]){  
    List<Student1> al=new ArrayList<Student1>();  
    al.add(new Student1(101,"Vijay",23));  
    al.add(new Student1(106,"Ajay",27));  
    al.add(new Student1(105,"Jai",21));  
    
    System.out.println("Before sorting");
    for(Student1 st:al){  
        System.out.println(st.rollno+" "+st.name+" "+st.age);   
    }
    Collections.sort(al);  
    System.out.println("After sorting");
    for(Student1 st:al){  
        System.out.println(st.rollno+" "+st.name+" "+st.age);   
    }  
}  
}  
