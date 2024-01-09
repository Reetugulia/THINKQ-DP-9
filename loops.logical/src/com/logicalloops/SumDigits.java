package com.logicalloops;

public class SumDigits {
	public static int findsum(int num)
	{
		int sum=0;
		do
		{
			sum+=(num%10);
			num/=10;
			
		}while(num!=0);
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		int n=5437;
		System.out.println("sum of digit"+findsum(n));
		
		
	}

}
