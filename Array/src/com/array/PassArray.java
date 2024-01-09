package com.array;

import java.util.Arrays;

public class PassArray {
	public static void squareElement(int ar[]) 
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i];
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,6,7,8};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		squareElement(arr) ;
		System.out.println(Arrays.toString(arr));
	}

}
