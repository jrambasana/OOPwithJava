import java.util.*;  
class Book2 {  
    int id;  
    String name,author,publisher;  
    int quantity;  
    public Book2(int id, String name, String author, String publisher, int quantity) {  
        this.id = id;  
        this.name = name;  
        this.author = author;  
        this.publisher = publisher;  
        this.quantity = quantity;  
    }  
    public String toString()
    {
        return "\n Book Id: "+id+"\n Name: "+name+"\n Author: "+author
                     +"\n Publisher: "+publisher+"\n Quantity: "+quantity;
    }
}   
public class LinkedHashSetExample {  
public static void main(String[] args) {  
    LinkedHashSet<Book2> hs=new LinkedHashSet<Book2>();  
    //Creating Book2s  
    Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);  
    //Adding Book2s to hash table  
    hs.add(b1);  
    hs.add(b2);  
    hs.add(b3);  
    //Traversing hash table  
    for(Book2 b:hs){  
        System.out.println(b);  
    }  
}  
}  

