package com.arrayassignment1;

import java.util.Arrays;

public class ArrayMax1 {
	public static int Secondmax(int ar[]) 
	{
		int max=ar[0];
		int secondmax =ar[0];
		for(int i=0;i<ar.length;i++)
		{
		
			if(max<ar[i])
			{
				secondmax=max;
				max=ar[i];
				
				System.out.println("max:"+max);
				System.out.println("SMAX:"+secondmax);
			}
			if(secondmax<ar[i]&&ar[i]!=max)
			{
				secondmax=ar[i];
			}
		}

		return secondmax;
		
	}

	
	
	
	public static void main(String[] args) {
		int arr[]= {20, 10, 31, 45, 100, 1, 105, 90};
		System.out.println(Arrays.toString(arr));
	//	Secondmax(arr) ;
		System.out.println("max:"+Secondmax(arr));
		
		
	}

}
