package com.array;

import java.util.Arrays;

public class MaximumElement {
	
	public static int SearchMax(int ar[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
				max=ar[i];
		}
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("maxinum number:"+SearchMax(arr));
		
		
	}

}
