package com.overriding;
class 	MyPerson{
	
	void display() 
	{
		System.out.println("i am a peron");
	}
}
class MyEmployee extends MyPerson
{
	@Override
	public void display() //prtected we can increase visibility
	{
		super.display();
		System.out.println("i am an Employee");
	}
	void show() 
	{
		System.out.println("employee skills show");
	}
}
class Celebrity extends MyPerson
{
	public void display(){
		
		System.out.println("i m celebrity");
	}//same or increase visibility
	}
public class DynamicMethodOverriding {
	public static void main(String[] args) {
		MyPerson p;
		p=new MyPerson();
		p.display();
		System.out.println("-------------------------------------------------");
		p=new Celebrity();
		p.display();
	}
	

}
