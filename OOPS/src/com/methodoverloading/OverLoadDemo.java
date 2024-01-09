package com.methodoverloading;

class shape
{
	 void calArea(int side)
	{
		System.out.println("area of square"+side*side);
	}
	 void calArea(float radius)
	{
		System.out.println("area of circle"+(3.14*radius*radius));
	}
	void calArea(int length,int breadth)
	{
		System.out.println("area of rectangle"+length*breadth);
	}
		
}

public class OverLoadDemo {
	public static void main(String[] args) {
		shape area=new shape();
		area.calArea(4);
		area.calArea(4.0f);
		area.calArea(4,5);
		
		}

}
