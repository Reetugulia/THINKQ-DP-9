package com.abstractassign;
abstract class Person
{
	Person()
	{
		System.out.println("this is a abstract constructor");
	}
	abstract void a_method();
	 
	void show() 
	{
		System.out.println("this is anormal method of abstract class");
	}
}
class Employee extends Person
{
	Employee ()
	{
		
	}
	void  a_method() 
	{
		System.out.println("this is abstract method");
	}
}
public class AbstractConstructor {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.a_method();
		e.show();
	}

}
