import java.util.*;  

class Books implements Comparable<Books>{  
int id;  
String name,author,publisher;  
int quantity;  
public Books(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  

public int compareTo(Books b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
        return 0;  
    }  
}  
}  
public class PriorityQueueExample01 {  
public static void main(String[] args) {  
    Queue<Books> queue=new PriorityQueue<Books>();  
    //Creating Bookss  
    Books b1=new Books(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Books b2=new Books(233,"Operating System","Galvin","Wiley",6);  
    Books b3=new Books(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Books b4=new Books(201,"Let us Java","Yashwant Kanetkar","BPB",9);  
    //Adding Bookss to the queue  
    queue.add(b4);  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);  
    
    System.out.println("Traversing the queue elements:");  
    //Traversing queue elements  
    for(Books b:queue){  
        System.out.println("Book id: " + b.id+" Name: "+b.name
            +" Author: "+b.author+" Publisher: "+b.publisher+" Stock: "+b.quantity);  
    }  
    queue.remove();  
    System.out.println("After removing one Books record:");  
    for(Books b:queue){  
        System.out.println("Book id: " + b.id+" Name: "+b.name
            +" Author: "+b.author+" Publisher: "+b.publisher+" Stock: "+b.quantity);  
    } 
}  
}  