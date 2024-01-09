package com.abstractassign;
abstract class Shape
{
	Shape()
	{
		
	}
	abstract void calculatearea();
	abstract void calcucircum();
}
class Circle extends Shape
{
	final double radii=4;
	Circle()
	{
		
	}
	
	void calculatearea() 
	{
		System.out.println("area:"+3.14*radii*radii);
	}
	void calcucircum() 
	{
		System.out.println("circumference:"+2*3.14*radii);
	}
}
class Rectangle extends Shape
{
	final double radii=4;
	Rectangle()
	{
		
	}
	
	void calculatearea() 
	{
		System.out.println("area:"+3.14*radii*radii);
	}
	void calcucircum() 
	{
		System.out.println("circumference:"+2*3.14*radii);
	}
}
class Square extends Shape
{
	int side=4;

	Square()
	{
		
	}
	
	void calculatearea() 
	{
		System.out.println("area:"+side*side);
	}
	void calcucircum() 
	{
		System.out.println("circumference:"+4*side);
	}
}

public class ShapeExtract {
	public static void main(String[] args) {
		Square s=new Square();
		s.calculatearea();
		s.calcucircum();
		Circle c=new Circle();
		c.calcucircum();
		c.calculatearea();
		Rectangle r=new Rectangle();
		r.calcucircum();
		r.calculatearea();
		
		
	}

}
