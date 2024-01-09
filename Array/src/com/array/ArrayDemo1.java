package com.array;

import java.util.Arrays;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		arr[0]=90;
		arr[1]=92;
		arr[2]=94;
		arr[3]=67;
		arr[4]=40;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("---------------------------------------");
		int arr1[]= {34,56,67,89,90};
		
		System.out.println( arr1);//it will give hashcode because arr1 is object
		System.out.println( Arrays.toString(arr1));
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
