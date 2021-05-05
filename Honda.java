class Bike{
	void run(){
  	System.out.println("Bike running");
  }
}
  
  
public class Honda extends Bike{
	
  void run(){
		System.out.println("Honda running");
  }
  
  public static void main(String args[])
  {
  	Bike b1 = new Bike();
    b1.run();
    
    Honda b2 = new Honda();
    b2.run();
    
    Bike b3 = new Honda();
    b3.run();
  }
}	