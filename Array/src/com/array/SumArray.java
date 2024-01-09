package com.array;

import java.util.Arrays;

public class SumArray {
	public static int arraySum(int ar[]) 
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
	public static void main(String[] args) {
	int	arr[]= {2,3,4,5};
	System.out.println(Arrays.toString(arr));
	System.out.println("sum is:"+arraySum(arr) );
	}

}
