package com.overridingassign;
class Bank {
    double rateOfInterest; 
    void display() 
    {
    	System.out.println("default:Rate of interest 2%");
    }
    
}
class Saving extends Bank
{
	 void display() 
	    {
	    	System.out.println("saving:Rate of interest 3%");
	    }
	}
class Current extends Bank
{
	 void display() 
	    {
	    	System.out.println("saving:Rate of interest 5%");
	    }
}
public class BankRate {
	public static void main(String[] args) {
		Saving s=new Saving();
		s.display();
		
		Current c=new Current();
		c.display();
		
		Bank b=new Bank();
		b.display();
		
		
	}

}
