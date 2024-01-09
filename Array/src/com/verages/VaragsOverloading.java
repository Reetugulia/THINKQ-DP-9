package com.verages;

public class VaragsOverloading {
	
	public static void display(int ...ar)
	{
		System.out.println("In int");
		for(int a:ar) 
		{
			System.out.println(a);
		}
	}
	public static void display(double ...ar)
	{
		System.out.println("In double");
		for(double a:ar) 
		{
			System.out.println(a);
		}
	}
	public static void display(String ...ar)
	{
		System.out.println("In String");
		for(String a:ar) 
		{
			System.out.println(a);
		}
	}
	public static void displayMe(int x,char ...ar)
	{
		System.out.println(x);
		System.out.println("in method 1");
		for(char a:ar) 
		{
			System.out.println(a);
		}
	}
	public static void displayMe(char x,int ...ar)
	{
		System.out.println(x);
		System.out.println("in method 2");
		for(int a:ar) 
		{
			System.out.println(a);
		}
	}
	
	
	
	public static void main(String[] args) {
		display(2,3,4);
		displayMe('A',1,2,3);
		displayMe(1,'A','B');
	//	displayMe(1,3,3,3,2); ambiguity no type promotion allowed
	}

}
