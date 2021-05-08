class Thread01Creation implements Runnable{  
	public void run()
	{  
		System.out.println("The T1 Thread is running...");  
	}  
	public static void main(String args[])
	{  
		Thread01Creation m1=new Thread01Creation ();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		System.out.println("The Main Thread is running...");  

 }  
}