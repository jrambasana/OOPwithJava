import java.util.*;  
class Book3 {  
    int id;  
    String name,author,publisher;  
    int quantity;  
    public Book3(int id, String name, String author, String publisher, int quantity) {  
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
public class TreeSetExample {  
public static void main(String[] args) {  
    Set<Book3> set = new TreeSet<Book3>();  
    //Creating Book3s  
    Book3 b1=new Book3(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book3 b2=new Book3(233,"Operating System","Galvin","Wiley",6);  
    Book3 b3=new Book3(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Book3s to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(Book3 b:set){  
        System.out.println(b);  
    }  
}  
}  
