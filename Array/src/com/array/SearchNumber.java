package com.array;

import java.util.Scanner;

public class SearchNumber {
	public static boolean FindElement(int ar[],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==n)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]= {1,3,5,6,8};
		System.out.println("enter the number searched");
		int num=sc.nextInt();
		if( FindElement(ar,num))
			System.out.println(num+"element is present in array");
		else
			System.out.println(num+"element is not present in array");
		
	}

}
