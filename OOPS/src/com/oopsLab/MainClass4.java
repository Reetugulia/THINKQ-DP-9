package com.oopsLab;
class S
{
	public S(int i) 
	{
		System.out.println(1);
	}
	public S() 
	{
		this(10);
		System.out.println(2);
	}
	
	void S() 
	{
		S(10);
		System.out.println(3);
	}
	void S(int i) 
	{
		System.out.println(4);
	}
	}
public class MainClass4 {
	public static void main(String[] args) {
		new S().S();
	}

}
