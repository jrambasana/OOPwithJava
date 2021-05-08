class Thread02Creation extends Thread{  
  String name="";
 public void run(){  
  for(int i=1;i<=50;i++)
  {
    System.out.println(name + " : " + i);  
  }  
 }  
 public static void main(String args[]){  
  Thread02Creation t1=new Thread02Creation();  
  Thread02Creation t2=new Thread02Creation();  
  t1.name = "A";
  t2.name = "B"; 
  t1.start();  
  t2.start();  
 }  
}  