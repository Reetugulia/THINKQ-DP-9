package com.methodoverloading;

public class Ambiguity {
//	static void display(int n)
//	{
//		System.out.println("In int");
//		System.out.println(n);
//	}
	
	static void display(float n)
	{
		System.out.println("In float");
		System.out.println(n);
	}
	
	static void display(double n)
	{
		System.out.println("In long");
		System.out.println(n);
	}
	
	static void display(int n, double m)
	{
		System.out.println("In first");
		System.out.println((n+m));
	}
	
	static void display(long n, float m)
	{
		System.out.println("In second");
		System.out.println((n+m));
	}
	
	public static void main(String[] args) {
		
		display('A');
		display(5);
		
		//display(56,9);
	}

}
