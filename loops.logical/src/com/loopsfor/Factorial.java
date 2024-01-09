package com.loopsfor;

import java.util.Scanner;

public class Factorial {
	public static long calfactorial(int num)
	{
		long fact1=1;
		for(int i=1;i<=num;i++) 
		{	fact1=fact1*i;
			System.out.println(fact1);
	}
		
			return fact1;
		}
				
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		calfactorial(n);
		sc.close();
	}

}
