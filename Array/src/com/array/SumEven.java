package com.array;

import java.util.Arrays;

public class SumEven {
	public static int EvenSum(int ar[]) 
	{
		int sum=0;
		for(int i=0;i<ar.length;i++) 
		{
			if ((ar[i])%2==0)
			{
				sum=sum+ar[i];
			}
			
				
		}
		return sum;
	}
	public static int oddSum(int ar[]) 
	{
		int sumO=0;
		for(int i=0;i<ar.length;i++) 
		{
			if ((ar[i])%2!=0)
			{
				sumO=sumO+ar[i];
			}
			
				
		}
		return sumO;
	}
	
		
	
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("even sum is:"+EvenSum(arr) );
		System.out.println("odd sum is:"+oddSum(arr)  );
		
	}

}
