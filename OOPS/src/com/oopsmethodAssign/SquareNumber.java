package com.oopsmethodAssign;

public class SquareNumber {
	int num;
	int square=num*num;
	
	void square1()
	{
		
		System.out.println("square of number:"+num);
	}
	int square2()
	{
		return square;
		
	}
	int square3(int num)
	{
		this.num=num;
		return square;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		 SquareNumber s1=new  SquareNumber();
		 s1.num=5;
		 s1.square1();
		 s1.square2();
		 s1.square3(6);
		 
	}

}
