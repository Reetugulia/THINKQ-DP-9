package com.advancelogicloops;

import java.util.Scanner;

public class FactorsNumber {
	public static void factornumber(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.println(i);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		factornumber(n);
		sc.close();
		
	}

}
