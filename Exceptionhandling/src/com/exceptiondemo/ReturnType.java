package com.exceptiondemo;

public class ReturnType {
	static int method (int data)
	{
		try
		{
			return 30/data;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return 0; // if exception is there
		
	}
	
	static int method1 (int data)
	{
		try
		{
			return 30/data;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
		
		//return -1;  // unreachable code
		
		
	}
	
	@SuppressWarnings("finally")
	
	static int method2 (int data)
	{
		try
		{
			return 30/data;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
		finally
		{
			return 1;
		}
		
		//return -1;  // unreachable code
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(method(0));
		System.out.println(method(2));
		
		System.out.println("-----------------------");
		System.out.println(method2(0));
		System.out.println(method2(2));
	}

}
