package com.abstractassign;
abstract class Animal
{
	Animal()
	{
		
	}
	abstract void voice();
	
}
class Cats extends Animal
{
	Cats()
	{
		
	}
	void voice()
	{
		System.out.println("cats meow");
	}
}
class Dogs extends Animal
{
	Dogs()
	{
		
	}
	void voice() 
	{
		System.out.println("Dogs bark");
	}
	
}
public class AnimalAbsract {
	public static void main(String[] args) {
		Dogs d=new Dogs();
		d.voice();
		Cats c=new Cats();
		c.voice();
	}
	

}
