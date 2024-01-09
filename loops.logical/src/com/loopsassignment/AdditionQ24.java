package com.loopsassignment;

public class AdditionQ24 {
	public static int totalsum(int num)
	{
		int total=0;
		for(int i=1;i<=100;i++)
		{
			total=i*i;
			total+=total;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		int n=100;
		System.out.println("total sum:"+totalsum(n));
		
		
	}

}
