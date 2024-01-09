package com.array2D;

import java.util.Arrays;

public class ReverseMatrix {
	static void reversearray(int a2[]) 
	{
		int len=a2.length;
		for(int i=0;i<len/2;i++)
		{
			int temp=a2[i];
			a2[i]=a2[len-i-1];
			a2[len-i-1]=temp;
				
		}
		System.out.println(Arrays.toString(a2));
	}
	public static void reverseMatrix(int a1[][])
	{
	
		for(int i=0;i<a1.length;i++)
		{
			
			reversearray(a1[i]) ;
		}
	}
	
	static void printArray(int arr[][])
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int m1[][]= {{1,2},{3,4}};
		reverseMatrix(m1);
		System.out.println("----------------------------------------------------");
		
		printArray(m1);
	}
		
	}


