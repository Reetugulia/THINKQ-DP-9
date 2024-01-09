package com.arrayassignment1;

import java.util.Arrays;

//. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] without using temporary array.//
public class ReverseArray4 {
	public static int [] arrayReverse(int ar[])
	{
		int len=ar.length;
		if(len%2==0)
		{
			for(int i=0;i<ar.length/2;i++)
			{
				int temp=ar[i];
				ar[i]=ar[ar.length-(i+1)];
				ar[ar.length-(i+1)]=temp;
				System.out.println(ar[i]);
			}
			
		}
		return ar;
	}

	public static void main(String[] args) {
		int ar[]= {3, 90, 45, 29, 37, 78};
		System.out.println(Arrays.toString(ar));
		
		for(int i:arrayReverse(ar)) 
		{
			System.out.print(i+" ,");
		}
	//	System.out.println(arrayReverse(ar));
		
	}

}
