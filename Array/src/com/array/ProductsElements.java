package com.array;

import java.util.Arrays;

public class ProductsElements {
	public static int ArrayProduct(int ar[]) 
	{
		int pro=1;
		for(int i=0;i<ar.length;i++) 
		{
			pro=pro*ar[i];
		}
		return pro;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,5};
		System.out.println(Arrays.toString(arr));
		System.out.println("product is:" +ArrayProduct(arr) );
	}

}
