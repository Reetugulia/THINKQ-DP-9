package com.overriding;
class Person{
	
	void display() 
	{
		System.out.println("i am a peron");
	}
}
class Employee extends Person
{
	@Override
	public void display() //prtected we can increase visibility
	{
		super.display();
		System.out.println("i am an Employee");
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.display();
		
		Person p=new Person();
		p.display();
	}
	

}
