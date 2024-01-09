package com.thiskeyword;

public class Cycle {
	int accountNo; 
	int noOfWheels;
	
	Cycle(){
		System.out.println("Iam a default constructor");
	}
	
	Cycle(int accountNo, int noOfWheels)
	{
		this();
		System.out.println("i am another constructor");
	}
	public String toString()
	{
		return "accountNo:"+accountNo+" "+"noOfWheels: "+noOfWheels;
	}
	
	public static void main(String[] args) {
		//Cycle c1=new Cycle ();
		//System.out.println(c1);
		
		Cycle c2=new Cycle (111,2);
		System.out.println(c2);
		
		
		
	}
	

}
