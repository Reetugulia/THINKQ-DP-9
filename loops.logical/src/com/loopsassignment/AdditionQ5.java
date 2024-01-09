package com.loopsassignment;

import java.util.Scanner;

public class AdditionQ5 {
	public static void printOne(int num)
	{
		int a=0;
		for(int i=1;i<=num;i++)
		{
			a=a*10+1;
			System.out.print(a+" ");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of terms:");
		int n=sc.nextInt();
		printOne(n);
		
	}

}
