package com.intermediate2;

import java.util.Arrays;

public class LeftRotate {
	public static void rotateLeft(int ar[])
	{
		int firstElement=ar[0];
		for(int i=0;i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		 ar[ar.length-1]=firstElement;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		int n=2;
		for(int i=0;i<n;i++)
		{
			rotateLeft( arr);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
