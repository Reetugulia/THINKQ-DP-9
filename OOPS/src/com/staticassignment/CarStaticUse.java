package com.staticassignment;

class showroom{
	static String showName;
	int carsold;
	int showGSTno;
	
	static
	{
		showName="TATA MOTERS";
	}
	showroom()
	{
		
	}
	showroom(int carsold,int showGSTno)
	{
		this.carsold=carsold;
		this.showGSTno=showGSTno;
	}
	void display() 
	{
		System.out.println("show room name:"+"");
	}
	
	
		
}


public class CarStaticUse {
	public static void main(String[] args) {
		showroom s1=new showroom();
		
		
		
	}
	

}
