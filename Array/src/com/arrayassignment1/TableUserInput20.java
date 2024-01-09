package com.arrayassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class TableUserInput20 {
	public static int[] Table(int ar[],int num)
	{ 
		for(int i=1;i<=10;i++)
		{
			ar[i-1]=(num*(i));
		}
		return ar;
		
					
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int ar[]=new int[10];

		System.out.println("enter the number:");
		int n=sc.nextInt();
		 Table(ar,n);
		 System.out.println(Arrays.toString(ar));
		
	}

}
