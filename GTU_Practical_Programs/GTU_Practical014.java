package GTU_Practical_Programs;

import java.util.ArrayList;
import java.util.Date;

public class GTU_Practical014 {
    public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		
		Loan loanAcc = new Loan(1, "Amit", 36, 8.6f, 100000);
		list.add(loanAcc);
		Date currDate = new Date();
		list.add(currDate);
		String str = "This is just a description.";
		list.add(str);
		MyCircleClass circle = new MyCircleClass(4);
		list.add(circle);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}

}

class Loan {
	private int accNumber;
	private String accHolderName;
	private int tenure;
    private float intRate;
    private long amount;
	
    Loan(int accNumber,String accHolderName,int tenure,float intRate, long amount)
    {
		this.accNumber=accNumber;
		this.accHolderName=accHolderName;
		this.tenure=tenure;
        this.intRate=intRate;
        this.amount=amount;
    }
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}    
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getIntRate() {
		return intRate;
	}
	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}
	public String toString() {
        String str = "Loan Account Details: AccountNo: "+getAccNumber()
                +", Account Holder Name: " + getAccHolderName()
                +", Amount: " + getAmount()
                +", Tenure: " + getTenure()
                +", Interest Rate: " + getIntRate();
		return str;
	}
}

class MyCircleClass{
	private double radius;
	
	MyCircleClass(double radius){
		this.radius = radius;
	}	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public String toString() {
		String str="Circle Details: Radius: " + getRadius() + ", Area: " + getArea();
		return str;
	}
}