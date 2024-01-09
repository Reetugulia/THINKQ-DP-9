package com.interfacedemo;
interface Movable
{
	public void move();
}
interface Displayable extends Movable
{
	void printme(String msg);
}
class Car implements Displayable
{

	
	@Override
	public void move() {
		System.out.println("Car is moving at a speed of 50 km/hr");
		
	}

	@Override
	public void printme(String msg) {
		System.out.println("my car:"+msg);
		
	}
	
	
}
class Bike implements Movable
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("bike speed is 60km/hr");
	}
	
}

public class interfaceofinterface {
	public static void main(String[] args) {
		Displayable d;
		d= new Car();
		d.move();
	    d.printme("BMW500series");
		
		System.out.println("--------------------------------"); 
		
		Movable m;
		
		m= new Car();
		m.move();
		
		m= new Bike();
		m.move();
		
	}

}
