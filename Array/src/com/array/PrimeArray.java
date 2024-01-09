package com.array;

import java.util.Arrays;

public class PrimeArray {
	
	public static void shortarr(int ar[]) 
	{ int temp;
		for(int i=1;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
					temp=ar[i];
				    
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int arr[]= {2,7,4,6,4,9,3};
		System.out.println(Arrays.toString(arr));
		
	}
	
}
	
