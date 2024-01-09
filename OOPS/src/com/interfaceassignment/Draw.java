package com.interfaceassignment;
interface Drawable
{
	void Draw();
}
class circle implements Drawable
{

	public circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("draw a circle");
	}
	
}
class Rectangle1  implements Drawable
{

	public Rectangle1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("draw a rectangle");
	}
	
}
class Triangle  implements Drawable
{

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("draw a Triangle");
	}
	
}
public class Draw {
	public static void main(String[] args) {
		Drawable d;
		d=new Triangle() ;
		d.Draw();
		d=new Rectangle1() ;
		d.Draw();
		d=new circle() ;
		d.Draw();
	}

}
