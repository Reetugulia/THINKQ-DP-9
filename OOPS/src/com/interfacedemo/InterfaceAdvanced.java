package com.interfacedemo;
interface Calculate
{
	void area();
	//java 8
	//mutable and backward compability
	default void volume() 
	{
		System.out.println("In volume method");
		display();
		show();
	}
	//common implementation for all classes
	//belong to interface
	static void info()
	{
		System.out.println("geometery");
		show();
	}
	//java 9
	//confidential info:sensitive info belongs to agreement
	private void display() 
	{
		System.out.println("made by reetu");
	}
	private static void show() 
	{
		System.out.println("pan no :FHS3452");
	}
}
class Square implements Calculate
{
	int side;

	Square()
	{
		
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area of square:"+(side*side));
	}
	Square(int side)
	{
		this.side=side;
	}
}
class Cube implements Calculate
{
	int side;
	Cube()
	{
		side=20;
	}
	Cube(int side)
	{
		this.side=side;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area of cube:"+(side*side));
	}
	public void volume()
	{
		Calculate.super.volume();
	  System.out.println("Volume of cube :"+(side*side*side));	
	}
	
}


public class InterfaceAdvanced {
	public static void main(String[] args) {
		Calculate.info();
		
		   Calculate  c;
		  c= new Square(23);
		  c.area();
		  c.volume();
		  
		  System.out.println("-----------------------------");
		  c= new Cube(50);
		  c.area();
		  c.volume();
	}

}
