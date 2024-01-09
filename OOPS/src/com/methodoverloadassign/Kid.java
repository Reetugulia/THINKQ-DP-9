package com.methodoverloadassign;

class book{

	
	void readbook(int num1) 
	{
		System.out.println("number of books read:1");
	}
	void readbook(int num1,int num2)
	{
		System.out.println("number of books read:2");
	}
	
}


public class Kid {
	public static void main(String[] args) {
		book b1=new book();
		b1.readbook(1);
		b1.readbook(1, 2);
		
	}

}
