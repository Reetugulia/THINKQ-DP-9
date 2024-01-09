package com.loopsLab;

public class SumNatural {
	public static int naturalsum(int num) {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("naturalsum:"+naturalsum(10));
		
	}

}
