package com.constructor;

public class ConstructorDemo {
	String name;
	
	public 	ConstructorDemo()
	{
		System.out.println("in default constructor");
		name="unknown";
	}
	
	ConstructorDemo(String name)
	{
		System.out.println("In perameterise constructor");
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public static void main(String[] args) {
		ConstructorDemo c1=new ConstructorDemo();
		System.out.println(c1.getName());
		
		ConstructorDemo c2=new ConstructorDemo();
		System.out.println(c2.getName());
		
	}

}
