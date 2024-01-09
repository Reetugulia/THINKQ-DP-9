package com.testpractice;

public class chekprime {
	
	public static boolean checkprime(int num)
	{
		if(num==0||num==1)
			return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
					return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		int n=5;
		if(true)
			System.out.println("prime");
		else
		System.out.println( checkprime(n));
		
	}
	

}
