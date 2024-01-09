package com.testpractice;

public class remainder {
	public static void rem(int num) 
	{
		int rem=0;
		do
		{
			rem=num%10;
			num/=10;
		}while(num!=0);
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("enter your number");
		int n=1234;
		rem(n) ;
		
			
	
		
	}

}
