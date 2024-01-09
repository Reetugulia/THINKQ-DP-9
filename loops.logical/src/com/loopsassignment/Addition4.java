package com.loopsassignment;

import java.util.Scanner;

public class Addition4 {
	public static void series(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
				System.out.println((2*i));
			else
				System.out.println((-2*i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		series(n);
		
	}

}
