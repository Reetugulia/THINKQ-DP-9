package com.arrayassignment1;

import java.util.Arrays;

public class SecondMin2 {
	public static int FindSecondMin(int ar[])
	{
		int min=ar[0];
		int secondmin=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(min>ar[i])
			{
	 
				secondmin=min;
				min=ar[i];
			}
			if(secondmin<ar[i]&&secondmin!=min)
			{
				
			}
		}
		//return min;
		return secondmin;
		
	
	}
	
	public static void main(String[] args) {
		int arr[]= {-20, 0, -25, 15, 19, 37, 23};
		System.out.println(Arrays.toString(arr));
		
		 System.out.println("min value:"+ FindSecondMin(arr));
		
	}

}
