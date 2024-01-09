package com.intermediate2;

import java.util.Arrays;

public class RightRoatate {
	public static void RotateRight(int ar[])
	{
		int lastelement=ar[ar.length-1];
		for(int i=ar.length-1;i>0;i--)
		{
			ar[i]=ar[i-1];
			
		}
		ar[0]=lastelement;
	}
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(ar));
		System.out.println("After rotation");
		int n=3;
		for(int i=0;i<n;i++)
		{
			RotateRight(ar);
		}
		System.out.println(Arrays.toString(ar));
	}

}
