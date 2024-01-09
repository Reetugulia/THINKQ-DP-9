package com.oopassignment;

public class RectangleArea {
	int length=10;
	int breadth=20;
	 
	void area() {
		
		int area=length*breadth;
		System.out.println("area:"+area);
	}
	public static void main(String[] args) {
		RectangleArea a1=new RectangleArea();
		a1.area();
	}

}
