package com.exception2;

import java.io.IOException;

public class Uncheckedpropogation {
	void method1() throws IOException
	{
		throw new IOException("input error");
	}
	void method2() throws IOException
	{
		method1();
	}
	void method3()
	{
		try
		{
			method2();	
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		Uncheckedpropogation obj=new Uncheckedpropogation();
		obj.method3();
		
	}

}
