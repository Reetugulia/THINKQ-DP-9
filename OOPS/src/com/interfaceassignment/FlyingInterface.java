package com.interfaceassignment;
interface flyable
{
	void fly_obj();
}
class spacecraft implements flyable
{

	public spacecraft() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("flying object is spacecraft");
	}
	
}
class Aeroplane implements flyable
{

	public Aeroplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("flying object is aeroplane");
	}
	
}
class Helicopter implements flyable
{

	public Helicopter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("flying object is helicopter");
	}
	
}
public class FlyingInterface {
	public static void main(String[] args) {
		flyable f;
		f=new Helicopter();
		f.fly_obj();
		f=new spacecraft();
		f.fly_obj();
		f=new Aeroplane();
		f.fly_obj();
	}

}
