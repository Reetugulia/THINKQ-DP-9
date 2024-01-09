package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNum {
	public static int SearchMin(int arr[])
	{
		//int min=Integer.MAX_VALUE;
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
			
		
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5];
		System.out.println("enter 5 numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt(5);
		}
	//	int arr[]= {1,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("min number:"+SearchMin(arr));
	}

}
