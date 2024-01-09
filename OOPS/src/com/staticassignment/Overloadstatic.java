package com.staticassignment;


public class Overloadstatic {
	
	static void show(String reetu)
	{
		System.out.println("string :"+reetu);
	}
	static void show(int n)
	{
		System.out.println("integer:"+ n);
	}
	

	public static void main(String[] args) {
		show(5);
		show("r");
	}

}
