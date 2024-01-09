package com.arrayassignment1;

import java.util.Arrays;

public class leftShift4 {
	public static void shift(int ar[])
	{ 
		int firstelement=ar[0];
		for(int i=0;i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		ar[ar.length-1]=firstelement;
	}
	public static void main(String[] args) {
		int ar[]= {3, 90, 45, 29, 37, 78};
		System.out.println(Arrays.toString(ar));
		for(int i=0;i<7;i++) 
		{
			shift(ar);
		}
		System.out.println(Arrays.toString(ar));
		
	}

}
