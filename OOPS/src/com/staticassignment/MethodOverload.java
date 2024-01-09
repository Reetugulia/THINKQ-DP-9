package com.staticassignment;
 
class overloading{
	
	void area1(int side)
	{
		System.out.println("area of square:"+side*side);
	}
	void area1(int length,int breadth)
	{
		System.out.println("area of rectangle:"+length*breadth);
	}
	
}

public class MethodOverload {

	public static void main(String[] args) {
		overloading l1=new overloading();
		l1.area1(5);
		l1.area1(2, 3);
	}
}
