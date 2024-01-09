package com.inheritence;
class Parent
{
	int value=10;
	
	void display()
	{
		System.out.println("in parent class:"+value);
	}
	}
class Child extends Parent
{
	int value=100;
	
	void show() 
	{
		int value=1000;
		System.out.println("---------------------------------------------");
		System.out.println("local:"+value);
		System.out.println("instance:"+this.value);
		System.out.println("parent:"+super.value);
	}
	void display() 
	{
		System.out.println("in child class:"+value);
	}
	}
public class SuperDemo {
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.show();
	}

}
