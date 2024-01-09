package com.oopsLab;
   
class findsquare{
	
	void squarenum(int num) 
	{
		System.out.println("square for int:"+num*num);
	}
	void squarenum(float num) 
	{
		System.out.println("square for float:"+num*num);
	}
	void squarenum(double num) 
	{
		System.out.println("square for double:"+num*num);
	}
}
public class Square {
	public static void main(String[] args) {
		findsquare s1= new findsquare();
		s1.squarenum(5);
		s1.squarenum(5f);
		s1.squarenum(5d);
	}

}
