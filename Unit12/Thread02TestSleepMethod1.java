class Thread02TestSleepMethod1 extends Thread{  
  String name = "";
 public void run(){  
  for(int i=1;i<=5;i++)
  {  
    try{
        Thread.sleep(1000);
      }
    catch(InterruptedException e)
    {System.out.println(e);}  
    System.out.println(name + " : " + i);  
  }  
 }  
 public static void main(String args[]){  
  Thread02TestSleepMethod1 t1=new Thread02TestSleepMethod1();  
  Thread02TestSleepMethod1 t2=new Thread02TestSleepMethod1();  
  t1.name = "T1";
  t2.name = "T2";

  t1.start();  
  t2.start();  
 }  
}  