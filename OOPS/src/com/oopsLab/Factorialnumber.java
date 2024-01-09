package com.oopsLab;

public class Factorialnumber {
	public static int factorialnum(int num) 
	{
		int fact=1;
		for(int i=1;i<=num;i++) 
		{
			fact=fact*i;
			System.out.println("factorial of "+i+" is"+fact);
		}
		return fact;
	}
	public static void main(String[] args) {
		int n=4;
		factorialnum(n);
	
		
	}

}
