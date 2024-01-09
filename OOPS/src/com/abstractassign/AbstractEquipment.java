package com.abstractassign;
abstract class Equipment
{
	public void fill() 
	{
		System.out.println("I am concrete method");
	}
	abstract void mix();
}
interface Mixable {
    void mix();
}

class Cement_mixer extends Equipment implements Mixable
{

	@Override
	public void mix() {
		// TODO Auto-generated method stub
		System.out.println("child class");
	}	
	void pour()
	{
		System.out.println("pour the equip");
	}
	
}

public class AbstractEquipment {
	public static void main(String[] args) {
		Cement_mixer c=new Cement_mixer();
		c.fill();
		c.mix();
		c.pour();
		System.out.println("---------------------------------------------------------");
		Equipment e;
		e=new Cement_mixer();
		e.mix();
	}

}
