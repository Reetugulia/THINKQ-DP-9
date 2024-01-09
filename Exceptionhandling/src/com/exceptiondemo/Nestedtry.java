package com.exceptiondemo;

public class Nestedtry {
	public static void main(String[] args) {
		int ar[]= {12,0,4};
		try 
		{
			for(int i=0;i<ar.length;i++)
			{
				try 
				{
					System.out.println("value:"+100/ar[i]);
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

}
