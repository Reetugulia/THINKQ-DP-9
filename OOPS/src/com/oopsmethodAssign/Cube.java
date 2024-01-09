package com.oopsmethodAssign;

public class Cube {
	int num;
	int cube=num*num*num;
	
	void cube()
	{
		
		System.out.println("square of number:"+num);
	}
	int cube2()
	{
		return cube;
		
	}
	int cube3(int num)
	{
		this.num=num;
		return cube;
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		 Cube s1=new  Cube();
		 s1.num=5;
		 s1.cube();
		 s1.cube2();
		 s1.cube3(2);
	}
}
