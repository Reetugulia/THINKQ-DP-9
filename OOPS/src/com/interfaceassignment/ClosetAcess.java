package com.interfaceassignment;
interface Closet
{
	
	abstract void  enterpin(int pin);
}

class People implements  Closet
{
     String name;
	 final int pin;
	@Override
	public void  enterpin(int pin) {
		if(pin==1234)
			System.out.println("closet is open");

		
	}
	People(String name)
	{
		this.pin = 1234;
		this.name=name;
		
	}

	
}

public class ClosetAcess {
	public static void main(String[] args) {
		Closet c;
		c=new People("reetu");
		c.enterpin(1234);
	}

}
